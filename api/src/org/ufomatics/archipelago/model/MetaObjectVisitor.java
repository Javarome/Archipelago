package org.ufomatics.archipelago.model;

import org.ufomatics.archipelago.model.MetaException;

/**
 * @author <a href="mailto:rr0@rr0.org">Jerome Beau</a>
 * @version $revision$
 */
public interface MetaObjectVisitor {
    MetaObject visit (MetaObject sighting) throws MetaException;
}
