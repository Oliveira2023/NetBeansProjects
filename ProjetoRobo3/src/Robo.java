/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 * Classe que modela a entidade rojbô.
 * @author lucia
 * codigo 3.29
 */
public class Robo extends RoboIdeia {

    private float velocidade = 1;
    private final float velocidadeMax = 5;
    private final float pesoCargaMax =20;
    private final String tipoTracao = "esteira";
    private final int altura = 60;
    private final int largura = 64;
    
    /**
     * Construtor padrão da aplicação
     */
    public Robo(){
    super.posicaoX = 50;
    super.posicaoY = 50;
    super.nome = "R-ATM";
    super.peso = 70;
    }
    /**
     * Construtor da classe robô quando cria um segundo robô com outro nome.
     * @param nome - nome do robô.
     */
    public Robo(String nome){
    super.posicaoX = 50;
    super.posicaoY = 50;
    super.nome = nome;
    super.peso = 70;
    }
    /**
     * Outro construtor da classe robô (construtor sobrepostos)
     * @param nome - nome informado
     * @param peso - peso informado
     */
    public Robo(String nome, float peso){
    super.posicaoX = 50;
    super.posicaoY = 50;
    super.nome = nome;
    super.peso = peso;
    }
    /**
     * outro construtor da classe robô, passando os valores da posição x e y.
     * @param posX valor da posição x inicial do robô.
     * @param posY valor da posição Y inicial do robô.
     */
    public Robo(float posX, float posY){
    super.posicaoX = posX;
    super.posicaoY = posY;
    super.nome = "R-ATM";
    super.peso = 70;
    }
    /**
     * outro construtor sobrepondo todos os argumentos
     * @param nome nome do robô
     * @param peso peso do robô.
     * @param posX valor da posição x inicial do robô.
     * @param posY valor da posição Y inicial do robô.
     */
    public Robo(String nome, float peso, float posX, float posY){
    super.posicaoX = posX;
    super.posicaoY = posY;
    super.nome = nome;
    super.peso = peso;
    }
    @Override
    public void move(float posX, float posY){
        if (Float.isNaN(posX) || Float.isNaN(posY) || Float.isInfinite(posX) || Float.isInfinite(posY)){
            throw new IllegalArgumentException("Args não válidos");
        }
        super.posicaoX = posX;
        super.posicaoY = posY;
    }
    /**
     * posY valor da posição Y inicial do robô.
     * @param dist distância a partir da posiçaõ atual no eixo x que será movido o robô.
     * @throws IllegalArgumentException exceção lançada quando o argumento for NaN ou infinito
     */
    @Override
    public void moveX(float dist){
        if (Float.isNaN(dist)|| Float.isInfinite(dist)){
            throw new IllegalArgumentException("Arg não válido");
        }
        super.posicaoX += dist;
    }
    /**
     * Move o robô ao longo do eixo y;
     * @param dist distância a partir da posição atual no  eixo y que será movido o robô.
     */
    @Override
    public void moveY(float dist){
        if (Float.isNaN(dist) || Float.isFinite(dist)){
        }
        super.posicaoY += dist;
    }
    /**
     * Metodo que define a orientação do robô e também efetua o movimento na
     * direção da orientaçaõ que a tecl foi pressionada
     * @param tecla char representando a tecla que foi pressionada
     */
    public void setOrientacao(char tecla){
        switch (tecla) {
            case 'w' -> {
                super.orientacao = Orientacao.FRENTE;
                moveY(5);
            }
            case 's' -> {
                super.orientacao = Orientacao.ATRAS;
                moveY(-5);
            }
            case 'a' -> {
                super.orientacao = Orientacao.ESQUERDA;
                moveX(-5);
            }
            case 'd' -> {
                super.orientacao = Orientacao.DIREITA;
                moveX(5);
            }
            default -> throw new IllegalArgumentException("Arg não válido");
        }

    }
    public void movimentosAgendados(String... moves){
        for (String tecla: moves){
            if ((!tecla.equals("--move") && !tecla.equals("-m"))){
                System.out.println("Tecla: " + tecla);
                System.out.println("Descrição: " + descricaoDoMovimento(tecla.charAt(0)));
                setOrientacao(tecla.charAt(0));
                printPos();
            }
        }
    }
    public String descricaoDoMovimento(char tecla){
        if (tecla == 'w'){
            return "Movendo para frente";
        }else if (tecla == 'a'){
            return "Movendo para esquerda";
        }else if (tecla == 's'){
            return "Movendo para baixo";
        }else if (tecla == 'd'){
            return "Movendo para direita";
        }else{
            return "";
        }
    }
    public boolean avaliaPos(int posX, int posY){
        posX = posX + largura/2;
        posY = posY + altura/2;
        if (posX < 40 || posX > 560 || posY < 30 || posY > 360) {
            return false; // delimitação da fronteira da sala
        }
        if ((posX >= 170 && posX <= 430) && (posY >=240 && posY <= 400)) {
            return false; // delimitção região operação máquinas
        }
        if ((posX >=0 && posX <=100) && (posY >=0 && posY <=200)){
            return false; // delimitação região caixas livros
        }
        if ((posX >= 500 && posX <= 600) && (posY >= 0 && posY <=200)) {
            return false; // delimitação região caixas impressoras
        }
        if ((posX >= 170 && posX <=430) && (posY >=0 && posY <= 90)){
            return false; // delimitação região caixas com HDs
        }
        if ((posX >= 170 && posX <=430) && (posY >=120 && posY <= 200)){
            return false; // delimitação região caixas com HDs
        }
        return true;
    }
    public void printStatus(){
        System.out.println("---Info R-ATM---");
        System.out.println("Nome do Robô: " + nome);
        System.out.println("Peso do Robô: " + peso);
        System.out.println("Velocidade Max: " + velocidadeMax);
        System.out.println("Carga Max do Robô: " + pesoCargaMax);
        System.out.println("Tipo Tração do Robô: " + tipoTracao);
        System.out.println("Posição X do robô: " + posicaoX);
        System.out.println("Posição Y do robô: " + posicaoY);
        System.out.println("-------------------------");
        
    }
    /**
     * Método que imprime a posição corrente do objeto.
     */
    public void printPos(){
        System.out.println("(x,y) = (" + posicaoX + "," + posicaoY + ")");
    }
    /**
     * Método que imprime o estado do objeto.
     * @return retorna uma string que representa o estado do objeto.
     */
    @Override
    public String toString(){
        return "Robô{" + "posiçãoX =" + posicaoX + ", posiçãoY = " + posicaoY + ", orientação = " + orientacao + "}";
    }
    /**
     * Método que compara dois objetos~.
     * @param obj objeto a ser comparado.
     * @return retorna true se o s dois objetos são iguais e retorna false se forem diferentes.
     */
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Robo){
            Robo robo = (Robo) obj;
            return super.nome.equals(robo.nome);
        }else{
            return false;
        }
    }
    public int getAltura(){
        return altura;
    }
    public int getLargura(){
        return largura;
    }
    public float getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(float velocidade){
        this.velocidade =  velocidade;
    }
    public int getPosicaoX(){
        return (int)this.posicaoX;
    }
    public int getPosicaoY(){
        return (int)this.posicaoY;
    }
    public void setPosicaoX(float posicaoX){
        this.posicaoX = posicaoX;
    }
    public void setPosicaoY(float posicaoY){
        this.posicaoY = posicaoY;
    }
}
