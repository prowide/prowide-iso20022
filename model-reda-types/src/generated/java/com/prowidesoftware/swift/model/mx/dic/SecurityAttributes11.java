
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
 * Tangible items of value to a business.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityAttributes11", propOrder = {
    "finInstrmId",
    "finInstrmTp",
    "finInstrmAttrbts"
})
public class SecurityAttributes11 {

    @XmlElement(name = "FinInstrmId")
    protected List<SecurityIdentification39> finInstrmId;
    @XmlElement(name = "FinInstrmTp")
    protected FinancialInstrument97 finInstrmTp;
    @XmlElement(name = "FinInstrmAttrbts")
    protected List<CommonFinancialInstrumentAttributes11> finInstrmAttrbts;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification39 }
     * 
     * 
     */
    public List<SecurityIdentification39> getFinInstrmId() {
        if (finInstrmId == null) {
            finInstrmId = new ArrayList<SecurityIdentification39>();
        }
        return this.finInstrmId;
    }

    /**
     * Gets the value of the finInstrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument97 }
     *     
     */
    public FinancialInstrument97 getFinInstrmTp() {
        return finInstrmTp;
    }

    /**
     * Sets the value of the finInstrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument97 }
     *     
     */
    public SecurityAttributes11 setFinInstrmTp(FinancialInstrument97 value) {
        this.finInstrmTp = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonFinancialInstrumentAttributes11 }
     * 
     * 
     */
    public List<CommonFinancialInstrumentAttributes11> getFinInstrmAttrbts() {
        if (finInstrmAttrbts == null) {
            finInstrmAttrbts = new ArrayList<CommonFinancialInstrumentAttributes11>();
        }
        return this.finInstrmAttrbts;
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
     * Adds a new item to the finInstrmId list.
     * @see #getFinInstrmId()
     * 
     */
    public SecurityAttributes11 addFinInstrmId(SecurityIdentification39 finInstrmId) {
        getFinInstrmId().add(finInstrmId);
        return this;
    }

    /**
     * Adds a new item to the finInstrmAttrbts list.
     * @see #getFinInstrmAttrbts()
     * 
     */
    public SecurityAttributes11 addFinInstrmAttrbts(CommonFinancialInstrumentAttributes11 finInstrmAttrbts) {
        getFinInstrmAttrbts().add(finInstrmAttrbts);
        return this;
    }

}
