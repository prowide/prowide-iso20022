package com.prowidesoftware.sandbox;

import javax.xml.bind.annotation.*;

/**
 * Sample JAXB class for test
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payload", propOrder = {
        "any"
})
public class Payload {

    @XmlAnyElement(lax = true)
    protected Object any;

}