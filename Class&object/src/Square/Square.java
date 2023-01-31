package Square;

public class Square {
    public int side;

    public Square(){

    }
    public Square(int side){
            this.side = side;
    } 

//Viod means it doesnt return anything
//int means it returns an integer
    public int getArea(){
        return this.side *this.side;
    }

    public int getParameter(){
        return 4 * this.side;
    }
    
}
