public class AttributesFilter implements Filter<String>{

    private final int[] columnIndices;

    public AttributesFilter(int[] columnIndices) {
        this.columnIndices = columnIndices;
    }

    @Override
    public String execute(String input) {
        String[] fields = input.split(",");
        StringBuilder filteredLine = new StringBuilder();
        for(int columnIndex : columnIndices){
            if(columnIndex >= 0 && columnIndex < fields.length) {
                filteredLine.append(fields[columnIndex]).append(",");
            }
            else {
                filteredLine.append(",");
            }
        }
        input = filteredLine.toString();
        return input;
    }
}
