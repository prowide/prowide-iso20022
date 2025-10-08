
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to search for a limit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitUtilisationJournalSearchCriteria2", propOrder = {
    "lmtTp",
    "jrnlActvtyDt",
    "acctId",
    "lmtCcy",
    "acctOwnr",
    "bilLmtCtrPtyId"
})
public class LimitUtilisationJournalSearchCriteria2 {

    @XmlElement(name = "LmtTp")
    @XmlSchemaType(name = "string")
    protected List<LimitType4Code> lmtTp;
    @XmlElement(name = "JrnlActvtyDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar jrnlActvtyDt;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;
    @XmlElement(name = "LmtCcy")
    protected String lmtCcy;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification136 acctOwnr;
    @XmlElement(name = "BilLmtCtrPtyId", required = true)
    protected SystemPartyIdentification8 bilLmtCtrPtyId;

    /**
     * Gets the value of the lmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitType4Code }
     * 
     * 
     */
    public List<LimitType4Code> getLmtTp() {
        if (lmtTp == null) {
            lmtTp = new ArrayList<LimitType4Code>();
        }
        return this.lmtTp;
    }

    /**
     * Gets the value of the jrnlActvtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getJrnlActvtyDt() {
        return jrnlActvtyDt;
    }

    /**
     * Sets the value of the jrnlActvtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LimitUtilisationJournalSearchCriteria2 setJrnlActvtyDt(XMLGregorianCalendar value) {
        this.jrnlActvtyDt = value;
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
    public LimitUtilisationJournalSearchCriteria2 setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the lmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmtCcy() {
        return lmtCcy;
    }

    /**
     * Sets the value of the lmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LimitUtilisationJournalSearchCriteria2 setLmtCcy(String value) {
        this.lmtCcy = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public LimitUtilisationJournalSearchCriteria2 setAcctOwnr(PartyIdentification136 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the bilLmtCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getBilLmtCtrPtyId() {
        return bilLmtCtrPtyId;
    }

    /**
     * Sets the value of the bilLmtCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public LimitUtilisationJournalSearchCriteria2 setBilLmtCtrPtyId(SystemPartyIdentification8 value) {
        this.bilLmtCtrPtyId = value;
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
     * Adds a new item to the lmtTp list.
     * @see #getLmtTp()
     * 
     */
    public LimitUtilisationJournalSearchCriteria2 addLmtTp(LimitType4Code lmtTp) {
        getLmtTp().add(lmtTp);
        return this;
    }

}
