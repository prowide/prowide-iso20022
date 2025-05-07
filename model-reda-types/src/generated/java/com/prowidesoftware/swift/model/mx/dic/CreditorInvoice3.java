
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
 * Specifies the identification attribtues of an invoice which are required by the creditor for the activation of the debtor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorInvoice3", propOrder = {
    "ltdPresntmntInd",
    "cstmrIdTp",
    "ctrctFrmtTp",
    "ctrctRefTp",
    "cdtrInstr",
    "actvtnReqDlvryPty"
})
public class CreditorInvoice3 {

    @XmlElement(name = "LtdPresntmntInd")
    protected boolean ltdPresntmntInd;
    @XmlElement(name = "CstmrIdTp")
    protected CustomerTypeRequest2 cstmrIdTp;
    @XmlElement(name = "CtrctFrmtTp")
    protected List<DocumentFormat2Choice> ctrctFrmtTp;
    @XmlElement(name = "CtrctRefTp")
    protected List<DocumentType1Choice> ctrctRefTp;
    @XmlElement(name = "CdtrInstr")
    protected String cdtrInstr;
    @XmlElement(name = "ActvtnReqDlvryPty", required = true)
    protected RTPPartyIdentification1 actvtnReqDlvryPty;

    /**
     * Gets the value of the ltdPresntmntInd property.
     * 
     */
    public boolean isLtdPresntmntInd() {
        return ltdPresntmntInd;
    }

    /**
     * Sets the value of the ltdPresntmntInd property.
     * 
     */
    public CreditorInvoice3 setLtdPresntmntInd(boolean value) {
        this.ltdPresntmntInd = value;
        return this;
    }

    /**
     * Gets the value of the cstmrIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTypeRequest2 }
     *     
     */
    public CustomerTypeRequest2 getCstmrIdTp() {
        return cstmrIdTp;
    }

    /**
     * Sets the value of the cstmrIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTypeRequest2 }
     *     
     */
    public CreditorInvoice3 setCstmrIdTp(CustomerTypeRequest2 value) {
        this.cstmrIdTp = value;
        return this;
    }

    /**
     * Gets the value of the ctrctFrmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrctFrmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctFrmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentFormat2Choice }
     * 
     * 
     */
    public List<DocumentFormat2Choice> getCtrctFrmtTp() {
        if (ctrctFrmtTp == null) {
            ctrctFrmtTp = new ArrayList<DocumentFormat2Choice>();
        }
        return this.ctrctFrmtTp;
    }

    /**
     * Gets the value of the ctrctRefTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrctRefTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctRefTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType1Choice }
     * 
     * 
     */
    public List<DocumentType1Choice> getCtrctRefTp() {
        if (ctrctRefTp == null) {
            ctrctRefTp = new ArrayList<DocumentType1Choice>();
        }
        return this.ctrctRefTp;
    }

    /**
     * Gets the value of the cdtrInstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrInstr() {
        return cdtrInstr;
    }

    /**
     * Sets the value of the cdtrInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditorInvoice3 setCdtrInstr(String value) {
        this.cdtrInstr = value;
        return this;
    }

    /**
     * Gets the value of the actvtnReqDlvryPty property.
     * 
     * @return
     *     possible object is
     *     {@link RTPPartyIdentification1 }
     *     
     */
    public RTPPartyIdentification1 getActvtnReqDlvryPty() {
        return actvtnReqDlvryPty;
    }

    /**
     * Sets the value of the actvtnReqDlvryPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTPPartyIdentification1 }
     *     
     */
    public CreditorInvoice3 setActvtnReqDlvryPty(RTPPartyIdentification1 value) {
        this.actvtnReqDlvryPty = value;
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
     * Adds a new item to the ctrctFrmtTp list.
     * @see #getCtrctFrmtTp()
     * 
     */
    public CreditorInvoice3 addCtrctFrmtTp(DocumentFormat2Choice ctrctFrmtTp) {
        getCtrctFrmtTp().add(ctrctFrmtTp);
        return this;
    }

    /**
     * Adds a new item to the ctrctRefTp list.
     * @see #getCtrctRefTp()
     * 
     */
    public CreditorInvoice3 addCtrctRefTp(DocumentType1Choice ctrctRefTp) {
        getCtrctRefTp().add(ctrctRefTp);
        return this;
    }

}
