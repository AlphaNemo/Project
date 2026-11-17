package edu.sustech.xiangqi.model;

public class HorsePiece extends Piece {
    public HorsePiece() {
        super("马", true);
    }

    @Override
    public boolean canMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        int rowDiff = toRow - fromRow;
        int colDiff = toCol - fromCol;

        if (Math.abs(rowDiff) == 2 && Math.abs(colDiff) == 1) {
            // 行方向走两格：检查行方向相邻的马腿位置
            int legRow = fromRow + rowDiff / 2;
            return board.getPieceAt(legRow, fromCol) == null;
        }

        if (Math.abs(rowDiff) == 1 && Math.abs(colDiff) == 2) {
            // 列方向走两格：检查列方向相邻的马腿位置
            int legCol = fromCol + colDiff / 2;
            return board.getPieceAt(fromRow, legCol) == null;
        }

        return false; // 不是“日”字走法
    }
}
