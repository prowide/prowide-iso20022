
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
@XmlType(name = "SecurityAttributes10", propOrder = {
    "finInstrmId",
    "finInstrmTp",
    "finInstrmAttrbts"
})
public class SecurityAttributes10 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification39 finInstrmId;
    @XmlElement(name = "FinInstrmTp")
    protected List<FinancialInstrument97> finInstrmTp;
    @XmlElement(name = "FinInstrmAttrbts")
    protected List<CommonFinancialInstrumentAttributes10> finInstrmAttrbts;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityAttributes10 setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument97 }
     * 
     * 
     * @return
     *     The value of the finInstrmTp property.
     */
    public List<FinancialInstrument97> getFinInstrmTp() {
        if (finInstrmTp == null) {
            finInstrmTp = new ArrayList<>();
        }
        return this.finInstrmTp;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmAttrbts property.
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
     * {@link CommonFinancialInstrumentAttributes10 }
     * 
     * 
     * @return
     *     The value of the finInstrmAttrbts property.
     */
    public List<CommonFinancialInstrumentAttributes10> getFinInstrmAttrbts() {
        if (finInstrmAttrbts == null) {
            finInstrmAttrbts = new ArrayList<>();
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
     * Adds a new item to the finInstrmTp list.
     * @see #getFinInstrmTp()
     * 
     */
    public SecurityAttributes10 addFinInstrmTp(FinancialInstrument97 finInstrmTp) {
        getFinInstrmTp().add(finInstrmTp);
        return this;
    }

    /**
     * Adds a new item to the finInstrmAttrbts list.
     * @see #getFinInstrmAttrbts()
     * 
     */
    public SecurityAttributes10 addFinInstrmAttrbts(CommonFinancialInstrumentAttributes10 finInstrmAttrbts) {
        getFinInstrmAttrbts().add(finInstrmAttrbts);
        return this;
    }

}
