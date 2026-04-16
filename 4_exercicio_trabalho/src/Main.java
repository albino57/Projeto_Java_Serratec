/*
* 4 - Um cadinho de tudo:
Exercício: Sistema de Veículos.
Detalhes:
- Criar interface Fretavel com metodo alugarVeiculo(pesoCarga, dias)
- Criar interface Tributavel com metodo calcularIpva()
- Criar classe mãe abstract sealed Veiculo (final placa, final marca, valorLocacaoDiaria,
  final anoFabricacao, precoFipe) implementa Fretavel e Tributavel.
- Criar classe filha Caminhao (final capacidadeCargaToneladas).
- Criar classe filha CarroPasseio.
*
---Regra de Negócio:
- Ao calcular o valor da locação através do método alugarVeiculo(pesoCarga, dias), caso
o peso da carga informado seja maior que a capacidade máxima do caminhão, deverá
ser aplicado um acréscimo de 10% sobre o valor total das diárias como taxa de sobrecarga.
*/
public class Main {
    public static void main(String[] args) {

    }
}

/*AJUDA no printf (print formatado).
%i  Integer
%u  int positivos
%s	String
%d  (byte, short, int, long)
    byte  = 1 byte  ( 8 bits) | -128 até 127
    short = 2 bytes (16 bits) | -32.768 até 32.767
    int   = 4 bytes (32 bits) | -2.147.483.648 até 2.147.483.647
    long  = 8 bytes (64 bits) | -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807

%f	Floating-point (float, double)
    float  = 4 bytes (32 bits) |  7 casas decimais
    double = 8 bytes (64 bits) | 15 casas decimais

%e  Floating-point em notação exponencial
%b	Boolean
%c	char
%t  data/hora

* --- Modificadores de Precisão (Exemplos) ---
%.2f -> Limita um float/double a 2 casas decimais (ex: 10.50)
%03d -> Preenche um inteiro com zeros à esquerda (ex: 007)
*/