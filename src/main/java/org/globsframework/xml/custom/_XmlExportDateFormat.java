package org.globsframework.xml.custom;

import org.globsframework.metamodel.GlobType;
import org.globsframework.metamodel.GlobTypeLoaderFactory;
import org.globsframework.metamodel.annotations.GlobCreateFromAnnotation;
import org.globsframework.metamodel.annotations.InitUniqueGlob;
import org.globsframework.metamodel.annotations.InitUniqueKey;
import org.globsframework.metamodel.fields.StringField;
import org.globsframework.model.Glob;
import org.globsframework.model.Key;

public class _XmlExportDateFormat {
    public static GlobType TYPE;

    public static StringField FORMAT;

    public static StringField ZONE_ID;

    @InitUniqueKey
    public static Key UNIQUE_KEY;

    static {
        GlobTypeLoaderFactory.create(_XmlExportDateFormat.class, "XmlExportDateFormat")
                .register(GlobCreateFromAnnotation.class, annotation -> TYPE.instantiate()
                        .set(FORMAT, ((XmlExportDateFormat_) annotation).value())
                        .set(ZONE_ID, ((XmlExportDateFormat_) annotation).zoneId())
                )
                .load();
    }

}
