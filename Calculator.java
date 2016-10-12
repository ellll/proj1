public class Calculator {
    private int result; // результат вычисления
    
    public void add(int ... params) { //сумма аргументов
        for(Integer param : params){
            this.result +=param;
}
}
    public int getResult() {
        return this.result; //получить результат        
}
    public void cleanResult() { //очистить результат
        this.result = 0;
}
    
    
}