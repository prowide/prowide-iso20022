
package com.prowidesoftware.swift.model.mx.dic;

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
 * Additional information related to the advising party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvisingPartyAdditionalInformation1", propOrder = {
    "refNb",
    "bkToBnfcryInf"
})
public class AdvisingPartyAdditionalInformation1 {

    @XmlElement(name = "RefNb")
    protected String refNb;
    @XmlElement(name = "BkToBnfcryInf")
    protected List<String> bkToBnfcryInf;

    /**
     * Gets the value of the refNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNb() {
        return refNb;
    }

    /**
     * Sets the value of the refNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdvisingPartyAdditionalInformation1 setRefNb(String value) {
        this.refNb = value;
        return this;
    }

    /**
     * Gets the value of the bkToBnfcryInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bkToBnfcryInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkToBnfcryInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBkToBnfcryInf() {
        if (bkToBnfcryInf == null) {
            bkToBnfcryInf = new ArrayList<String>();
        }
        return this.bkToBnfcryInf;
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
     * Adds a new item to the bkToBnfcryInf list.
     * @see #getBkToBnfcryInf()
     * 
     */
    public AdvisingPartyAdditionalInformation1 addBkToBnfcryInf(String bkToBnfcryInf) {
        getBkToBnfcryInf().add(bkToBnfcryInf);
        return this;
    }

}
