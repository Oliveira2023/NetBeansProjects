/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package AppCmdMath;

/**
// *Metodo que verifica algumas entradas e retorna conforme configurado
* @param "", se nenhum parametro for enviado exibe uma mensagem de erro
* @param "--help", exibe informações sobre as fuções executadas no programa
* @param "--author", exibe a infomação do autor do projeto
* @param "--version", exibe a versão atual do programa
* @param "pow", exibe a potenciação de x elevado a y, x e y enviados via linha de comando
* @return retorna o resultado de x elevado a y
 * @author Luciano
 */
import java.util.Locale;
public class ArgsLinhaDeComandoMath {

    public static void main(String[] args) {
        Locale.setDefault(new Locale.Builder().setLanguage("en").setRegion("US").build());
        if (args.length ==0) {
            System.err.println("Precisa de Argumentos");
            System.exit(0);
        }
        String resp = "ERROR";

        args[0] = args[0].toLowerCase();
        if (args[0].equals("--help")) {
            resp = "Programa: Cmd Math via args \n" +
            "Funçoes: \n\tsqrt x\n\tpow x y\n\tlog10 x\n" +
            "Constantes: \n\tPI\n\te\n\tPHI\n";
        }else if (args[0].equals("--author")) {
            resp = "Autor: Jesimar da Silva Arantes";
        }else if (args[0].equals("--version")) {
            resp = "Versão: 1.0";
        }else if (args[0].equals("sqrt")) {
            resp =  Math.sqrt(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("pow")) {
            double x = Double.parseDouble(args[1]);
            double y = Double.parseDouble(args[2]);
            resp = Math.pow(x, y) + "";
        }else if (args[0].equals("log10")) {
            resp = Math.log10(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("pi")) {
            resp = Math.PI + "";
        }else if (args[0].equals("e")) {
            resp = Math.E + "";
        }else if (args[0].equals("phi")) {
            resp = 1.618033988749895 + "";
            
        }
        System.out.println(resp);
            
        
    }
}
