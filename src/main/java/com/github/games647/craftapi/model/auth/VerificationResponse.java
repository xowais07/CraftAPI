package com.github.games647.craftapi.model.auth;

import com.github.games647.craftapi.model.skin.SkinProperty;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/**
 * Premium server join verification response.
 */
public class VerificationResponse {

    private UUID id;
    private String name;
    private SkinProperty[] properties;

    /**
     * @return premium UUID
     */
    public UUID getId() {
        return id;
    }

    /**
     * @return case-sensitive player name
     */
    public String getName() {
        return name;
    }

    /**
     * @return additional properties like Skin data
     */
    public SkinProperty[] getProperties() {
        return Arrays.copyOf(properties, properties.length);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof VerificationResponse) {
            VerificationResponse that = (VerificationResponse) other;
            return Objects.equals(id, that.id) &&
                    Objects.equals(name, that.name) &&
                    Arrays.equals(properties, that.properties);
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name);
        result = 31 * result + Arrays.hashCode(properties);
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + '{' +
                "id=" + id +
                ", name='" + name + '\'' +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }
}
