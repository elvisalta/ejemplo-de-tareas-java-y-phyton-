ejemplo de tarea 
def obtener_temperaturas_diarias():
    """
    Solicita al usuario que ingrese las temperaturas diarias y las retorna como una lista.
    """
    temperaturas = []
    for i in range(7):
        while True:
            try:
                temp = float(input(f"Ingrese la temperatura para el día {i+1}: "))
                temperaturas.append(temp)
                break
            except ValueError:
                print("Entrada inválida. Por favor, ingrese un valor numérico.")
    return temperaturas

def calcular_promedio_semanal(temperaturas):
    """
    Calcula el promedio de las temperaturas ingresadas.
    """
    return sum(temperaturas) / len(temperaturas)

# Programa principal
if __name__ == "__main__":
    temperaturas_diarias = obtener_temperaturas_diarias()
    promedio = calcular_promedio_semanal(temperaturas_diarias)

    print("\nPromedio de la temperatura semanal:", promedio)