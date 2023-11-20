package academy.devdojo.javaoneforall.javacore.objectorientation.Kenum.domain;

public enum CustomerType {

    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    START_UP(3, "Start-up");

    private int dbvalue;
    private String reportValue;

    CustomerType(int dbValue, String reportValue) {
        this.dbvalue = dbValue;
        this.reportValue = reportValue;
    }

    public static CustomerType getByReportValue(String reportValue) {
        for (CustomerType value : values()) {
            if (value.getReportValue().equalsIgnoreCase(reportValue)) {
                return value;
            }
        }
        return null;
    }

    public int getDbvalue() {
        return this.dbvalue;
    }

    public String getReportValue() {
        return reportValue;
    }
}
