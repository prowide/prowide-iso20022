
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * The message PartyRegistrationAndGuaranteeStatus is either sent by a factoring service to a financing client to indicate the status of a factoring service agreement or from a guarantee issuer to a factoring client or a factoring service to indicate the guarantee covering a requested factoring service agreement. The message can also be sent to an interested party.
 * The factoring service or guarantee issuer may include references to a corresponding PartyRegistrationAndGuaranteeRequest message or other related messages and may include referenced data.
 * The message contains information about other parties to be notified about the financial service agreement or the guarantee and whether these parties are required to acknowledge the agreement.
 * The message contains information returned by the financial institution indicating acceptance or rejection of the trade partner; a positive response is necessary before being able to assign financial items concerning the trade party.
 * This message contains identifications of cash accounts to enable payer and payee to treat the transferred payment obligations.
 * The message can carry digital signatures if required by context.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRegistrationAndGuaranteeStatusV01", propOrder = {
    "hdr",
    "agrmtList",
    "agrmtCnt",
    "itmCnt",
    "ctrlSum",
    "attchdMsg"
})
public class PartyRegistrationAndGuaranteeStatusV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessLetter1 hdr;
    @XmlElement(name = "AgrmtList", required = true)
    protected List<FinancingAgreementList1Tsin01000101> agrmtList;
    @XmlElement(name = "AgrmtCnt")
    protected String agrmtCnt;
    @XmlElement(name = "ItmCnt")
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "AttchdMsg")
    protected List<EncapsulatedBusinessMessage1> attchdMsg;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLetter1 }
     *     
     */
    public BusinessLetter1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLetter1 }
     *     
     */
    public PartyRegistrationAndGuaranteeStatusV01 setHdr(BusinessLetter1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the agrmtList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the agrmtList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgrmtList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingAgreementList1Tsin01000101 }
     * 
     * 
     * @return
     *     The value of the agrmtList property.
     */
    public List<FinancingAgreementList1Tsin01000101> getAgrmtList() {
        if (agrmtList == null) {
            agrmtList = new ArrayList<>();
        }
        return this.agrmtList;
    }

    /**
     * Gets the value of the agrmtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtCnt() {
        return agrmtCnt;
    }

    /**
     * Sets the value of the agrmtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyRegistrationAndGuaranteeStatusV01 setAgrmtCnt(String value) {
        this.agrmtCnt = value;
        return this;
    }

    /**
     * Gets the value of the itmCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmCnt() {
        return itmCnt;
    }

    /**
     * Sets the value of the itmCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyRegistrationAndGuaranteeStatusV01 setItmCnt(String value) {
        this.itmCnt = value;
        return this;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PartyRegistrationAndGuaranteeStatusV01 setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
        return this;
    }

    /**
     * Gets the value of the attchdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedBusinessMessage1 }
     * 
     * 
     * @return
     *     The value of the attchdMsg property.
     */
    public List<EncapsulatedBusinessMessage1> getAttchdMsg() {
        if (attchdMsg == null) {
            attchdMsg = new ArrayList<>();
        }
        return this.attchdMsg;
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
     * Adds a new item to the agrmtList list.
     * @see #getAgrmtList()
     * 
     */
    public PartyRegistrationAndGuaranteeStatusV01 addAgrmtList(FinancingAgreementList1Tsin01000101 agrmtList) {
        getAgrmtList().add(agrmtList);
        return this;
    }

    /**
     * Adds a new item to the attchdMsg list.
     * @see #getAttchdMsg()
     * 
     */
    public PartyRegistrationAndGuaranteeStatusV01 addAttchdMsg(EncapsulatedBusinessMessage1 attchdMsg) {
        getAttchdMsg().add(attchdMsg);
        return this;
    }

}
