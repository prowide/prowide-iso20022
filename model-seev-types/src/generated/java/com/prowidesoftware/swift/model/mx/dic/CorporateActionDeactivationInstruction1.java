
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the deactivation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDeactivationInstruction1", propOrder = {
    "deactvtnDtAndTm",
    "optnDtls"
})
public class CorporateActionDeactivationInstruction1 {

    @XmlElement(name = "DeactvtnDtAndTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactvtnDtAndTm;
    @XmlElement(name = "OptnDtls")
    protected List<CorporateActionOption2> optnDtls;

    /**
     * Gets the value of the deactvtnDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeactvtnDtAndTm() {
        return deactvtnDtAndTm;
    }

    /**
     * Sets the value of the deactvtnDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionDeactivationInstruction1 setDeactvtnDtAndTm(XMLGregorianCalendar value) {
        this.deactvtnDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the optnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOption2 }
     * 
     * 
     */
    public List<CorporateActionOption2> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<CorporateActionOption2>();
        }
        return this.optnDtls;
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
     * Adds a new item to the optnDtls list.
     * @see #getOptnDtls()
     * 
     */
    public CorporateActionDeactivationInstruction1 addOptnDtls(CorporateActionOption2 optnDtls) {
        getOptnDtls().add(optnDtls);
        return this;
    }

}
