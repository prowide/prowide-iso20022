
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Record details from National BIC directory.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectoryEntry1", propOrder = {
    "acctOwnr",
    "chngTp",
    "chngId",
    "drctryCmonDtls",
    "ptcptPrfl"
})
public class DirectoryEntry1 {

    @XmlElement(name = "AcctOwnr", required = true)
    protected FinancialInstitutionIdentification9 acctOwnr;
    @XmlElement(name = "ChngTp")
    protected String chngTp;
    @XmlElement(name = "ChngId")
    protected BigDecimal chngId;
    @XmlElement(name = "DrctryCmonDtls", required = true)
    protected DirectoryInformation1 drctryCmonDtls;
    @XmlElement(name = "PtcptPrfl")
    protected ParticipantProfile1 ptcptPrfl;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public FinancialInstitutionIdentification9 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public DirectoryEntry1 setAcctOwnr(FinancialInstitutionIdentification9 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the chngTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChngTp() {
        return chngTp;
    }

    /**
     * Sets the value of the chngTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectoryEntry1 setChngTp(String value) {
        this.chngTp = value;
        return this;
    }

    /**
     * Gets the value of the chngId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChngId() {
        return chngId;
    }

    /**
     * Sets the value of the chngId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DirectoryEntry1 setChngId(BigDecimal value) {
        this.chngId = value;
        return this;
    }

    /**
     * Gets the value of the drctryCmonDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DirectoryInformation1 }
     *     
     */
    public DirectoryInformation1 getDrctryCmonDtls() {
        return drctryCmonDtls;
    }

    /**
     * Sets the value of the drctryCmonDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectoryInformation1 }
     *     
     */
    public DirectoryEntry1 setDrctryCmonDtls(DirectoryInformation1 value) {
        this.drctryCmonDtls = value;
        return this;
    }

    /**
     * Gets the value of the ptcptPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantProfile1 }
     *     
     */
    public ParticipantProfile1 getPtcptPrfl() {
        return ptcptPrfl;
    }

    /**
     * Sets the value of the ptcptPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantProfile1 }
     *     
     */
    public DirectoryEntry1 setPtcptPrfl(ParticipantProfile1 value) {
        this.ptcptPrfl = value;
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

}
