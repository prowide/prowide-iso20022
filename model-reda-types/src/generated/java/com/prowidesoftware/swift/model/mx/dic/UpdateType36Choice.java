
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between action to request on a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateType36Choice", propOrder = {
    "updTp",
    "rplc"
})
public class UpdateType36Choice {

    @XmlElement(name = "UpdTp")
    protected List<UpdateType35Choice> updTp;
    @XmlElement(name = "Rplc")
    protected SecurityAttributes12 rplc;

    /**
     * Gets the value of the updTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateType35Choice }
     * 
     * 
     */
    public List<UpdateType35Choice> getUpdTp() {
        if (updTp == null) {
            updTp = new ArrayList<UpdateType35Choice>();
        }
        return this.updTp;
    }

    /**
     * Gets the value of the rplc property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public SecurityAttributes12 getRplc() {
        return rplc;
    }

    /**
     * Sets the value of the rplc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public UpdateType36Choice setRplc(SecurityAttributes12 value) {
        this.rplc = value;
        return this;
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
     * Adds a new item to the updTp list.
     * @see #getUpdTp()
     * 
     */
    public UpdateType36Choice addUpdTp(UpdateType35Choice updTp) {
        getUpdTp().add(updTp);
        return this;
    }

}
