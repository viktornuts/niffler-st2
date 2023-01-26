package niffler.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class CategoryJson {
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("username")
    private String username;

    public CategoryJson() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
