package org.prayandgrow.prayandgrow;

import android.util.JsonReader;

import java.io.IOException;

/**
 * Created by mgarapich on 09.04.16.
 */
public class Patron {
    private String mName;

    public Patron() {}

    public Patron(String name) {
        mName = name;
    }

    public static Patron fromJson(JsonReader reader) throws IOException {
        reader.beginObject();
        Patron patron = new Patron();

        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                patron.setName(reader.nextString());
            } else {
                reader.skipValue();
            }
        }

        reader.endObject();
        return patron;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String toString() {
        return getName();
    }
}
