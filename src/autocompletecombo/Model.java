/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autocompletecombo;

/**
 *
 * @author Noman
 */
public class Model {
    private String id;
    private String name;

    public Model(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    
}
