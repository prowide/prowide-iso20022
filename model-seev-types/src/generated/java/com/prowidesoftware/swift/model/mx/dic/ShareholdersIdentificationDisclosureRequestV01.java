
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * The ShareholdersIdentificationDisclosureRequest message is sent by an issuer or by a third party nominated by the issuer (such as an issuer's agent) to the first intermediaries in a custody chain or is sent by any intermediaries in a custody chain to the next intermediary down the chain of intermediaries (towards the investor side of the chain) in order to request the disclosure of shareholders identity and provides information on the receiving party to whom responses must be sent, on the financial instrument concerned and on the deadline to respond.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholdersIdentificationDisclosureRequestV01", propOrder = {
    "issrDsclsrReqId",
    "dsclsrReqTp",
    "fwdReqInd",
    "rspnThrghChainInd",
    "finInstrmId",
    "shrhldrsDsclsrRcrdDt",
    "shrsQtyThrshld",
    "reqShrHeldDt",
    "dsclsrRspnRcpt",
    "issrDsclsrDdln",
    "dsclsrRspnDdln",
    "issr",
    "splmtryData"
})
public class ShareholdersIdentificationDisclosureRequestV01 {

    @XmlElement(name = "IssrDsclsrReqId", required = true)
    protected String issrDsclsrReqId;
    @XmlElement(name = "DsclsrReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected DisclosureRequestType1Code dsclsrReqTp;
    @XmlElement(name = "FwdReqInd")
    protected Boolean fwdReqInd;
    @XmlElement(name = "RspnThrghChainInd")
    protected Boolean rspnThrghChainInd;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ShrhldrsDsclsrRcrdDt", required = true)
    protected DateFormat46Choice shrhldrsDsclsrRcrdDt;
    @XmlElement(name = "ShrsQtyThrshld")
    protected BigDecimal shrsQtyThrshld;
    @XmlElement(name = "ReqShrHeldDt")
    protected RequestShareHeldDate1Choice reqShrHeldDt;
    @XmlElement(name = "DsclsrRspnRcpt", required = true)
    protected PartyIdentification214 dsclsrRspnRcpt;
    @XmlElement(name = "IssrDsclsrDdln", required = true)
    protected DateFormat46Choice issrDsclsrDdln;
    @XmlElement(name = "DsclsrRspnDdln")
    protected DateFormat46Choice dsclsrRspnDdln;
    @XmlElement(name = "Issr")
    protected PartyIdentification129Choice issr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the issrDsclsrReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrDsclsrReqId() {
        return issrDsclsrReqId;
    }

    /**
     * Sets the value of the issrDsclsrReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setIssrDsclsrReqId(String value) {
        this.issrDsclsrReqId = value;
        return this;
    }

    /**
     * Gets the value of the dsclsrReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureRequestType1Code }
     *     
     */
    public DisclosureRequestType1Code getDsclsrReqTp() {
        return dsclsrReqTp;
    }

    /**
     * Sets the value of the dsclsrReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureRequestType1Code }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setDsclsrReqTp(DisclosureRequestType1Code value) {
        this.dsclsrReqTp = value;
        return this;
    }

    /**
     * Gets the value of the fwdReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFwdReqInd() {
        return fwdReqInd;
    }

    /**
     * Sets the value of the fwdReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setFwdReqInd(Boolean value) {
        this.fwdReqInd = value;
        return this;
    }

    /**
     * Gets the value of the rspnThrghChainInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRspnThrghChainInd() {
        return rspnThrghChainInd;
    }

    /**
     * Sets the value of the rspnThrghChainInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setRspnThrghChainInd(Boolean value) {
        this.rspnThrghChainInd = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the shrhldrsDsclsrRcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat46Choice }
     *     
     */
    public DateFormat46Choice getShrhldrsDsclsrRcrdDt() {
        return shrhldrsDsclsrRcrdDt;
    }

    /**
     * Sets the value of the shrhldrsDsclsrRcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat46Choice }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setShrhldrsDsclsrRcrdDt(DateFormat46Choice value) {
        this.shrhldrsDsclsrRcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the shrsQtyThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShrsQtyThrshld() {
        return shrsQtyThrshld;
    }

    /**
     * Sets the value of the shrsQtyThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setShrsQtyThrshld(BigDecimal value) {
        this.shrsQtyThrshld = value;
        return this;
    }

    /**
     * Gets the value of the reqShrHeldDt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestShareHeldDate1Choice }
     *     
     */
    public RequestShareHeldDate1Choice getReqShrHeldDt() {
        return reqShrHeldDt;
    }

    /**
     * Sets the value of the reqShrHeldDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestShareHeldDate1Choice }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setReqShrHeldDt(RequestShareHeldDate1Choice value) {
        this.reqShrHeldDt = value;
        return this;
    }

    /**
     * Gets the value of the dsclsrRspnRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification214 }
     *     
     */
    public PartyIdentification214 getDsclsrRspnRcpt() {
        return dsclsrRspnRcpt;
    }

    /**
     * Sets the value of the dsclsrRspnRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification214 }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setDsclsrRspnRcpt(PartyIdentification214 value) {
        this.dsclsrRspnRcpt = value;
        return this;
    }

    /**
     * Gets the value of the issrDsclsrDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat46Choice }
     *     
     */
    public DateFormat46Choice getIssrDsclsrDdln() {
        return issrDsclsrDdln;
    }

    /**
     * Sets the value of the issrDsclsrDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat46Choice }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setIssrDsclsrDdln(DateFormat46Choice value) {
        this.issrDsclsrDdln = value;
        return this;
    }

    /**
     * Gets the value of the dsclsrRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat46Choice }
     *     
     */
    public DateFormat46Choice getDsclsrRspnDdln() {
        return dsclsrRspnDdln;
    }

    /**
     * Sets the value of the dsclsrRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat46Choice }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setDsclsrRspnDdln(DateFormat46Choice value) {
        this.dsclsrRspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 setIssr(PartyIdentification129Choice value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ShareholdersIdentificationDisclosureRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
