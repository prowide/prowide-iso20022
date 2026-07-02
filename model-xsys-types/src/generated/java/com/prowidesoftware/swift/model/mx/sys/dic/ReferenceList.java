
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ReferenceList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceList", propOrder = {
    "copySnFRef"
})
public class ReferenceList {

    @XmlElement(name = "CopySnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected List<String> copySnFRef;

    /**
     * CopyStoreAndForwardReference Gets the value of the copySnFRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the copySnFRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopySnFRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the copySnFRef property.
     */
    public List<String> getCopySnFRef() {
        if (copySnFRef == null) {
            copySnFRef = new ArrayList<>();
        }
        return this.copySnFRef;
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
     * Adds a new item to the copySnFRef list.
     * @see #getCopySnFRef()
     * 
     */
    public ReferenceList addCopySnFRef(String copySnFRef) {
        getCopySnFRef().add(copySnFRef);
        return this;
    }

}
