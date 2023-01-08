package Frame.Scene.PlayerModel;


public enum MovementTypes{

    MOVE_X_NEG(CordTypes.X,  -2),
    MOVE_X_POS(CordTypes.X , 2),



    MOVE_Y_NEG(CordTypes.Y , 2),
    MOVE_Y_POS(CordTypes.Y , -2);



    private final int move;
    private final CordTypes cordTypes;


    MovementTypes(CordTypes cordTypes, int move) {
        this.move = move;
        this.cordTypes  =  cordTypes;
    }
    public int getMove(){
        return  this.move;
    }
    public CordTypes getCordTypes(){
        return this.cordTypes;
    }

    public enum  CordTypes{
        X,
        Y;
    }







}
