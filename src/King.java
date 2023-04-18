// King: To represent King as a chess piece

public class King extends Piece {
    private boolean castlingDone = false;

    public King(boolean white)
    {
        super(white);
    }
  
    public boolean isCastlingDone()
    {
        return this.castlingDone;
    }
  
    public void setCastlingDone(boolean castlingDone)
    {
        this.castlingDone = castlingDone;
    }
}
