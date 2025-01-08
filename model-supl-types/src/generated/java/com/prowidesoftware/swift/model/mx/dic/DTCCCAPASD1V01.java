
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
 * The DTCCCAPASD1 messge extends ISO corporate action movement preliminary advice message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAPASD1V01", propOrder = {
    "corpActnGnlInf",
    "corpActnMvmntSctiesMvmntDtls",
    "corpActnMvmntCshMvmntDtls"
})
public class DTCCCAPASD1V01 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD1 corpActnGnlInf;
    @XmlElement(name = "CorpActnMvmntSctiesMvmntDtls")
    protected List<CorporateActionMovementSecuritiesMovementDetailsSD1> corpActnMvmntSctiesMvmntDtls;
    @XmlElement(name = "CorpActnMvmntCshMvmntDtls")
    protected List<CorporateActionMovementCashMovementDetailsSD1> corpActnMvmntCshMvmntDtls;

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
    public DTCCCAPASD1V01 setCorpActnGnlInf(CorporateActionGeneralInformationSD1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnMvmntSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnMvmntSctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnMvmntSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionMovementSecuritiesMovementDetailsSD1 }
     * 
     * 
     * @return
     *     The value of the corpActnMvmntSctiesMvmntDtls property.
     */
    public List<CorporateActionMovementSecuritiesMovementDetailsSD1> getCorpActnMvmntSctiesMvmntDtls() {
        if (corpActnMvmntSctiesMvmntDtls == null) {
            corpActnMvmntSctiesMvmntDtls = new ArrayList<>();
        }
        return this.corpActnMvmntSctiesMvmntDtls;
    }

    /**
     * Gets the value of the corpActnMvmntCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnMvmntCshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnMvmntCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionMovementCashMovementDetailsSD1 }
     * 
     * 
     * @return
     *     The value of the corpActnMvmntCshMvmntDtls property.
     */
    public List<CorporateActionMovementCashMovementDetailsSD1> getCorpActnMvmntCshMvmntDtls() {
        if (corpActnMvmntCshMvmntDtls == null) {
            corpActnMvmntCshMvmntDtls = new ArrayList<>();
        }
        return this.corpActnMvmntCshMvmntDtls;
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
     * Adds a new item to the corpActnMvmntSctiesMvmntDtls list.
     * @see #getCorpActnMvmntSctiesMvmntDtls()
     * 
     */
    public DTCCCAPASD1V01 addCorpActnMvmntSctiesMvmntDtls(CorporateActionMovementSecuritiesMovementDetailsSD1 corpActnMvmntSctiesMvmntDtls) {
        getCorpActnMvmntSctiesMvmntDtls().add(corpActnMvmntSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnMvmntCshMvmntDtls list.
     * @see #getCorpActnMvmntCshMvmntDtls()
     * 
     */
    public DTCCCAPASD1V01 addCorpActnMvmntCshMvmntDtls(CorporateActionMovementCashMovementDetailsSD1 corpActnMvmntCshMvmntDtls) {
        getCorpActnMvmntCshMvmntDtls().add(corpActnMvmntCshMvmntDtls);
        return this;
    }

}
