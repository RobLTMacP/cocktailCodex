package maddogsoftworks.cocktail_codex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tools")
public class Tool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tool_name", nullable = false)
    private String toolName;

    public Tool() {
    }

    public Tool(Integer id, String toolName) {
        this.id = id;
        this.toolName = toolName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }
}
