
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for Crypto complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crypto", namespace = "urn:swift:snl:ns.SwSec", propOrder = {
    "content"
})
public class SwSecCrypto {

    @XmlElementRefs({
        @XmlElementRef(name = "CryptoControl", namespace = "urn:swift:snl:ns.SwSec", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CryptoInternal", namespace = "urn:swift:snl:ns.SwSec", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CryptoInfo", namespace = "urn:swift:snl:ns.SwSec", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CryptoDescriptor", namespace = "urn:swift:snl:ns.SwSec", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CryptoUserInfo", namespace = "urn:swift:snl:ns.SwSec", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "CryptoDescriptor" is used by two different parts of a schema. See: 
     * line 82 of file:/Users/fernando-mac/prowide/pw-swift-codegen/codegen-mx/src/main/resources/xsd-xsys/SwSec.xsd
     * line 79 of file:/Users/fernando-mac/prowide/pw-swift-codegen/codegen-mx/src/main/resources/xsd-xsys/SwSec.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names:Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SwSecCryptoControl }{@code >}
     * {@link JAXBElement }{@code <}{@link SwSecCryptoDescriptor }{@code >}
     * {@link JAXBElement }{@code <}{@link SwSecCryptoInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link SwSecMixedAny }{@code >}
     * {@link JAXBElement }{@code <}{@link SwSecMixedAny }{@code >}
     * 
     * 
     * @return
     *     The value of the content property.
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the content list.
     * @see #getContent()
     * 
     */
    public SwSecCrypto addContent(JAXBElement<?> content) {
        getContent().add(content);
        return this;
    }

}
