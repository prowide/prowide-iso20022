
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Action to perform in case of error on the related action in progress.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorAction5", propOrder = {
    "actnRslt",
    "actnToPrc"
})
public class ErrorAction5 {

    @XmlElement(name = "ActnRslt", required = true)
    @XmlSchemaType(name = "string")
    protected List<TerminalManagementActionResult5Code> actnRslt;
    @XmlElement(name = "ActnToPrc", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementErrorAction2Code actnToPrc;

    /**
     * Gets the value of the actnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalManagementActionResult5Code }
     * 
     * 
     */
    public List<TerminalManagementActionResult5Code> getActnRslt() {
        if (actnRslt == null) {
            actnRslt = new ArrayList<TerminalManagementActionResult5Code>();
        }
        return this.actnRslt;
    }

    /**
     * Gets the value of the actnToPrc property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementErrorAction2Code }
     *     
     */
    public TerminalManagementErrorAction2Code getActnToPrc() {
        return actnToPrc;
    }

    /**
     * Sets the value of the actnToPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementErrorAction2Code }
     *     
     */
    public ErrorAction5 setActnToPrc(TerminalManagementErrorAction2Code value) {
        this.actnToPrc = value;
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
     * Adds a new item to the actnRslt list.
     * @see #getActnRslt()
     * 
     */
    public ErrorAction5 addActnRslt(TerminalManagementActionResult5Code actnRslt) {
        getActnRslt().add(actnRslt);
        return this;
    }

}
