package com.github.games647.craftapi.model.skin;

import java.util.Objects;

/**
 * Metadata for a skin property
 */
public class MetadataModel {

    private final String model = "slim";

    /**
     * @return "slim" if it's an slim model
     */
    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof MetadataModel) {
            MetadataModel that = (MetadataModel) other;
            return Objects.equals(model, that.model);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + '{' +
                "model='" + model + '\'' +
                '}';
    }
}
