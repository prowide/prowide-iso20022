
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "ReservationSearchCriteria1", propOrder = {
    "sysId",
    "dfltRsvatnTp",
    "curRsvatnTp",
    "acctOwnr",
    "acctId"
})
public class ReservationSearchCriteria1 {

    @XmlElement(name = "SysId")
    protected SystemIdentificationChoice sysId;
    @XmlElement(name = "DfltRsvatnTp")
    @XmlSchemaType(name = "string")
    protected List<ReservationType1Code> dfltRsvatnTp;
    @XmlElement(name = "CurRsvatnTp")
    @XmlSchemaType(name = "string")
    protected List<ReservationType1Code> curRsvatnTp;
    @XmlElement(name = "AcctOwnr")
    protected String acctOwnr;
    @XmlElement(name = "AcctId")
    protected AccountIdentification1Choice acctId;

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemIdentificationChoice }
     *     
     */
    public SystemIdentificationChoice getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemIdentificationChoice }
     *     
     */
    public ReservationSearchCriteria1 setSysId(SystemIdentificationChoice value) {
        this.sysId = value;
        return this;
    }

    /**
     * Gets the value of the dfltRsvatnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltRsvatnTp property.
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
     * {@link ReservationType1Code }
     * 
     * 
     * @return
     *     The value of the dfltRsvatnTp property.
     */
    public List<ReservationType1Code> getDfltRsvatnTp() {
        if (dfltRsvatnTp == null) {
            dfltRsvatnTp = new ArrayList<>();
        }
        return this.dfltRsvatnTp;
    }

    /**
     * Gets the value of the curRsvatnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the curRsvatnTp property.
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
     * {@link ReservationType1Code }
     * 
     * 
     * @return
     *     The value of the curRsvatnTp property.
     */
    public List<ReservationType1Code> getCurRsvatnTp() {
        if (curRsvatnTp == null) {
            curRsvatnTp = new ArrayList<>();
        }
        return this.curRsvatnTp;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReservationSearchCriteria1 setAcctOwnr(String value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountIdentification1Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public ReservationSearchCriteria1 setAcctId(AccountIdentification1Choice value) {
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
    public ReservationSearchCriteria1 addDfltRsvatnTp(ReservationType1Code dfltRsvatnTp) {
        getDfltRsvatnTp().add(dfltRsvatnTp);
        return this;
    }

    /**
     * Adds a new item to the curRsvatnTp list.
     * @see #getCurRsvatnTp()
     * 
     */
    public ReservationSearchCriteria1 addCurRsvatnTp(ReservationType1Code curRsvatnTp) {
        getCurRsvatnTp().add(curRsvatnTp);
        return this;
    }

}
