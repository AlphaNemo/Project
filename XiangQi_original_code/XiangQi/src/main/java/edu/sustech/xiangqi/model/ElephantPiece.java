package edu.sustech.xiangqi.model;

public class ElephantPiece extends Piece {
    public ElephantPiece() {
        super("象", true);
    }

    @Override
    public boolean canMove(Board board, int fromRow, int fromCol, int toRow, int toCol) {
        int rowDiff = toRow - fromRow;
        int colDiff = toCol - fromCol;

        if (Math.abs(rowDiff) == 2 && Math.abs(colDiff) == 2) {
            // 对角线方向走两个单位：检查路径是否存在棋子
            return board.getPieceAt((fromRow+toRow)/2, (fromCol+toCol)/2) == null;
        }

        return false; // 不是“田”字走法
    }
}

