/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse305_lab5;

/**
 *
 * @author admin
 */
public class Report {
    private String title;
    private String description;
    
    private Report() {}

    
    public static class Builder {
        private String title;
        private String description;
  

        public Builder() {}

       
        public Report build() {
            Report report = new Report();
            report.title = this.title;
            report.description = this.description;
            
            return report;
        }
    }
}
