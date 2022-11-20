
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
 * The DTCCCACOSD1 message extends ISO corporate action movement confirmation message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCACOSD1V01", propOrder = {
    "corpActnGnlInf",
    "corpActnConfSctiesMvmntDtls",
    "corpActnConfCshMvmntDtls"
})
public class DTCCCACOSD1V01 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD1 corpActnGnlInf;
    @XmlElement(name = "CorpActnConfSctiesMvmntDtls")
    protected List<CorporateActionConfirmationSecuritiesMovementDetailsSD1> corpActnConfSctiesMvmntDtls;
    @XmlElement(name = "CorpActnConfCshMvmntDtls")
    protected List<CorporateActionConfirmationCashMovementDetailsSD1> corpActnConfCshMvmntDtls;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD1 }
     *     
     */
    public CorporateActionGeneralInformationSD1 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD1 }
     *     
     */
    public DTCCCACOSD1V01 setCorpActnGnlInf(CorporateActionGeneralInformationSD1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnConfSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnConfSctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnConfSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionConfirmationSecuritiesMovementDetailsSD1 }
     * 
     * 
     */
    public List<CorporateActionConfirmationSecuritiesMovementDetailsSD1> getCorpActnConfSctiesMvmntDtls() {
        if (corpActnConfSctiesMvmntDtls == null) {
            corpActnConfSctiesMvmntDtls = new ArrayList<CorporateActionConfirmationSecuritiesMovementDetailsSD1>();
        }
        return this.corpActnConfSctiesMvmntDtls;
    }

    /**
     * Gets the value of the corpActnConfCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnConfCshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnConfCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionConfirmationCashMovementDetailsSD1 }
     * 
     * 
     */
    public List<CorporateActionConfirmationCashMovementDetailsSD1> getCorpActnConfCshMvmntDtls() {
        if (corpActnConfCshMvmntDtls == null) {
            corpActnConfCshMvmntDtls = new ArrayList<CorporateActionConfirmationCashMovementDetailsSD1>();
        }
        return this.corpActnConfCshMvmntDtls;
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
     * Adds a new item to the corpActnConfSctiesMvmntDtls list.
     * @see #getCorpActnConfSctiesMvmntDtls()
     * 
     */
    public DTCCCACOSD1V01 addCorpActnConfSctiesMvmntDtls(CorporateActionConfirmationSecuritiesMovementDetailsSD1 corpActnConfSctiesMvmntDtls) {
        getCorpActnConfSctiesMvmntDtls().add(corpActnConfSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnConfCshMvmntDtls list.
     * @see #getCorpActnConfCshMvmntDtls()
     * 
     */
    public DTCCCACOSD1V01 addCorpActnConfCshMvmntDtls(CorporateActionConfirmationCashMovementDetailsSD1 corpActnConfCshMvmntDtls) {
        getCorpActnConfCshMvmntDtls().add(corpActnConfCshMvmntDtls);
        return this;
    }

}
