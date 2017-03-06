package com.github.cchacin;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class Serializer extends StdSerializer<WithSerializer> {
    public Serializer() {
        super(WithSerializer.class);
    }

    @Override
    public void serialize(WithSerializer withSerializer,
                          JsonGenerator gen,
                          SerializerProvider provider) throws IOException {

        gen.writeStartObject();
        gen.writeObjectField("a", withSerializer.getA());
        gen.writeObjectField("b", withSerializer.getB());
        gen.writeObjectField("c", withSerializer.getC());
        gen.writeObjectField("d", withSerializer.getD());
        gen.writeEndObject();
    }
}
