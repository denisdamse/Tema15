public enum RangLocalitate {
    I(1),II(2),III(3),IV(4);
    private int rangLocalitate;
    public int getRanglocalitate()
    {
        return this.rangLocalitate;
    }
    private RangLocalitate(int rang)
    {
        this.rangLocalitate=rang;
    }
}
