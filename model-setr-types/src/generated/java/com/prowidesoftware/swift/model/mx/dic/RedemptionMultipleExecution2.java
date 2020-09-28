
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Execution of a redemption order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionMultipleExecution2", propOrder = {
    "bnfcryDtls",
    "plcOfTrad",
    "ordrDtTm",
    "cxlRght",
    "invstmtAcctDtls",
    "indvExctnDtls",
    "blkCshSttlmDtls"
})
public class RedemptionMultipleExecution2 {

    @XmlElement(name = "BnfcryDtls")
    protected IndividualPerson2 bnfcryDtls;
    @XmlElement(name = "PlcOfTrad")
    protected String plcOfTrad;
    @XmlElement(name = "OrdrDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordrDtTm;
    @XmlElement(name = "CxlRght")
    protected CancellationRight1 cxlRght;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount13 invstmtAcctDtls;
    @XmlElement(name = "IndvExctnDtls", required = true)
    protected List<RedemptionExecution4> indvExctnDtls;
    @XmlElement(name = "BlkCshSttlmDtls")
    protected PaymentTransaction15 blkCshSttlmDtls;

    /**
     * Gets the value of the bnfcryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson2 }
     *     
     */
    public IndividualPerson2 getBnfcryDtls() {
        return bnfcryDtls;
    }

    /**
     * Sets the value of the bnfcryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson2 }
     *     
     */
    public RedemptionMultipleExecution2 setBnfcryDtls(IndividualPerson2 value) {
        this.bnfcryDtls = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionMultipleExecution2 setPlcOfTrad(String value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public RedemptionMultipleExecution2 setOrdrDtTm(XMLGregorianCalendar value) {
        this.ordrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the cxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRight1 }
     *     
     */
    public CancellationRight1 getCxlRght() {
        return cxlRght;
    }

    /**
     * Sets the value of the cxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRight1 }
     *     
     */
    public RedemptionMultipleExecution2 setCxlRght(CancellationRight1 value) {
        this.cxlRght = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public InvestmentAccount13 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public RedemptionMultipleExecution2 setInvstmtAcctDtls(InvestmentAccount13 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the indvExctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvExctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvExctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedemptionExecution4 }
     * 
     * 
     */
    public List<RedemptionExecution4> getIndvExctnDtls() {
        if (indvExctnDtls == null) {
            indvExctnDtls = new ArrayList<RedemptionExecution4>();
        }
        return this.indvExctnDtls;
    }

    /**
     * Gets the value of the blkCshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction15 }
     *     
     */
    public PaymentTransaction15 getBlkCshSttlmDtls() {
        return blkCshSttlmDtls;
    }

    /**
     * Sets the value of the blkCshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction15 }
     *     
     */
    public RedemptionMultipleExecution2 setBlkCshSttlmDtls(PaymentTransaction15 value) {
        this.blkCshSttlmDtls = value;
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
     * Adds a new item to the indvExctnDtls list.
     * @see #getIndvExctnDtls()
     * 
     */
    public RedemptionMultipleExecution2 addIndvExctnDtls(RedemptionExecution4 indvExctnDtls) {
        getIndvExctnDtls().add(indvExctnDtls);
        return this;
    }

}
