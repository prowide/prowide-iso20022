
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
 * Defines the criteria used to search for a reservation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationSearchCriteria5", propOrder = {
    "dtTm",
    "sysId",
    "dfltRsvatnTp",
    "curRsvatnTp",
    "acctOwnr",
    "acctId"
})
public class ReservationSearchCriteria5 {

    @XmlElement(name = "DtTm")
    protected DateTimeSearch2Choice dtTm;
    @XmlElement(name = "SysId")
    protected SystemIdentification2Choice sysId;
    @XmlElement(name = "DfltRsvatnTp")
    protected List<ReservationType2Choice> dfltRsvatnTp;
    @XmlElement(name = "CurRsvatnTp")
    protected List<ReservationType2Choice> curRsvatnTp;
    @XmlElement(name = "AcctOwnr")
    protected BranchAndFinancialInstitutionIdentification6 acctOwnr;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSearch2Choice }
     *     
     */
    public DateTimeSearch2Choice getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSearch2Choice }
     *     
     */
    public ReservationSearchCriteria5 setDtTm(DateTimeSearch2Choice value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public SystemIdentification2Choice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentification2Choice }
     *     
     */
    public ReservationSearchCriteria5 setSysId(SystemIdentification2Choice value) {
        this.sysId = value;
        return this;
    }

    /**
     * Gets the value of the dfltRsvatnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dfltRsvatnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltRsvatnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationType2Choice }
     * 
     * 
     */
    public List<ReservationType2Choice> getDfltRsvatnTp() {
        if (dfltRsvatnTp == null) {
            dfltRsvatnTp = new ArrayList<ReservationType2Choice>();
        }
        return this.dfltRsvatnTp;
    }

    /**
     * Gets the value of the curRsvatnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curRsvatnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurRsvatnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationType2Choice }
     * 
     * 
     */
    public List<ReservationType2Choice> getCurRsvatnTp() {
        if (curRsvatnTp == null) {
            curRsvatnTp = new ArrayList<ReservationType2Choice>();
        }
        return this.curRsvatnTp;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public ReservationSearchCriteria5 setAcctOwnr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public ReservationSearchCriteria5 setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
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
     * Adds a new item to the dfltRsvatnTp list.
     * @see #getDfltRsvatnTp()
     * 
     */
    public ReservationSearchCriteria5 addDfltRsvatnTp(ReservationType2Choice dfltRsvatnTp) {
        getDfltRsvatnTp().add(dfltRsvatnTp);
        return this;
    }

    /**
     * Adds a new item to the curRsvatnTp list.
     * @see #getCurRsvatnTp()
     * 
     */
    public ReservationSearchCriteria5 addCurRsvatnTp(ReservationType2Choice curRsvatnTp) {
        getCurRsvatnTp().add(curRsvatnTp);
        return this;
    }

}
