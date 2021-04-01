class shape
{
    int getCorner(){
        return 0;
    }
}


class retangele extends shape
{
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }
}