
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
 * Context of the sale involved in a card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleContext8", propOrder = {
    "saleId",
    "saleRefId",
    "saleRefNb",
    "goodsAndSvcsTp",
    "goodAndSvcsSubTp",
    "goodAndSvcsOthrSubTp",
    "goodAndSvcDlvryChanl",
    "othrGoodAndSvcDlvryChanl",
    "goodAndSvcDlvrySchdl",
    "othrGoodAndSvcDlvrySchdl",
    "spltPmtInd",
    "rctReqInd",
    "rctTp",
    "rctDstn",
    "addtlData"
})
public class SaleContext8 {

    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "SaleRefNb")
    protected String saleRefNb;
    @XmlElement(name = "GoodsAndSvcsTp")
    @XmlSchemaType(name = "string")
    protected GoodsAndServices1Code goodsAndSvcsTp;
    @XmlElement(name = "GoodAndSvcsSubTp")
    @XmlSchemaType(name = "string")
    protected GoodsAndServicesSubType1Code goodAndSvcsSubTp;
    @XmlElement(name = "GoodAndSvcsOthrSubTp")
    protected String goodAndSvcsOthrSubTp;
    @XmlElement(name = "GoodAndSvcDlvryChanl")
    @XmlSchemaType(name = "string")
    protected GoodAndServiceDeliveryChannel1Code goodAndSvcDlvryChanl;
    @XmlElement(name = "OthrGoodAndSvcDlvryChanl")
    protected String othrGoodAndSvcDlvryChanl;
    @XmlElement(name = "GoodAndSvcDlvrySchdl")
    @XmlSchemaType(name = "string")
    protected GoodAndServiceDeliverySchedule1Code goodAndSvcDlvrySchdl;
    @XmlElement(name = "OthrGoodAndSvcDlvrySchdl")
    protected String othrGoodAndSvcDlvrySchdl;
    @XmlElement(name = "SpltPmtInd")
    protected Boolean spltPmtInd;
    @XmlElement(name = "RctReqInd")
    protected Boolean rctReqInd;
    @XmlElement(name = "RctTp")
    @XmlSchemaType(name = "string")
    protected List<ReceiptType1Code> rctTp;
    @XmlElement(name = "RctDstn")
    protected String rctDstn;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext8 setSaleId(String value) {
        this.saleId = value;
        return this;
    }

    /**
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext8 setSaleRefId(String value) {
        this.saleRefId = value;
        return this;
    }

    /**
     * Gets the value of the saleRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefNb() {
        return saleRefNb;
    }

    /**
     * Sets the value of the saleRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext8 setSaleRefNb(String value) {
        this.saleRefNb = value;
        return this;
    }

    /**
     * Gets the value of the goodsAndSvcsTp property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsAndServices1Code }
     *     
     */
    public GoodsAndServices1Code getGoodsAndSvcsTp() {
        return goodsAndSvcsTp;
    }

    /**
     * Sets the value of the goodsAndSvcsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsAndServices1Code }
     *     
     */
    public SaleContext8 setGoodsAndSvcsTp(GoodsAndServices1Code value) {
        this.goodsAndSvcsTp = value;
        return this;
    }

    /**
     * Gets the value of the goodAndSvcsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsAndServicesSubType1Code }
     *     
     */
    public GoodsAndServicesSubType1Code getGoodAndSvcsSubTp() {
        return goodAndSvcsSubTp;
    }

    /**
     * Sets the value of the goodAndSvcsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsAndServicesSubType1Code }
     *     
     */
    public SaleContext8 setGoodAndSvcsSubTp(GoodsAndServicesSubType1Code value) {
        this.goodAndSvcsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the goodAndSvcsOthrSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodAndSvcsOthrSubTp() {
        return goodAndSvcsOthrSubTp;
    }

    /**
     * Sets the value of the goodAndSvcsOthrSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext8 setGoodAndSvcsOthrSubTp(String value) {
        this.goodAndSvcsOthrSubTp = value;
        return this;
    }

    /**
     * Gets the value of the goodAndSvcDlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link GoodAndServiceDeliveryChannel1Code }
     *     
     */
    public GoodAndServiceDeliveryChannel1Code getGoodAndSvcDlvryChanl() {
        return goodAndSvcDlvryChanl;
    }

    /**
     * Sets the value of the goodAndSvcDlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodAndServiceDeliveryChannel1Code }
     *     
     */
    public SaleContext8 setGoodAndSvcDlvryChanl(GoodAndServiceDeliveryChannel1Code value) {
        this.goodAndSvcDlvryChanl = value;
        return this;
    }

    /**
     * Gets the value of the othrGoodAndSvcDlvryChanl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrGoodAndSvcDlvryChanl() {
        return othrGoodAndSvcDlvryChanl;
    }

    /**
     * Sets the value of the othrGoodAndSvcDlvryChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext8 setOthrGoodAndSvcDlvryChanl(String value) {
        this.othrGoodAndSvcDlvryChanl = value;
        return this;
    }

    /**
     * Gets the value of the goodAndSvcDlvrySchdl property.
     * 
     * @return
     *     possible object is
     *     {@link GoodAndServiceDeliverySchedule1Code }
     *     
     */
    public GoodAndServiceDeliverySchedule1Code getGoodAndSvcDlvrySchdl() {
        return goodAndSvcDlvrySchdl;
    }

    /**
     * Sets the value of the goodAndSvcDlvrySchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodAndServiceDeliverySchedule1Code }
     *     
     */
    public SaleContext8 setGoodAndSvcDlvrySchdl(GoodAndServiceDeliverySchedule1Code value) {
        this.goodAndSvcDlvrySchdl = value;
        return this;
    }

    /**
     * Gets the value of the othrGoodAndSvcDlvrySchdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrGoodAndSvcDlvrySchdl() {
        return othrGoodAndSvcDlvrySchdl;
    }

    /**
     * Sets the value of the othrGoodAndSvcDlvrySchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext8 setOthrGoodAndSvcDlvrySchdl(String value) {
        this.othrGoodAndSvcDlvrySchdl = value;
        return this;
    }

    /**
     * Gets the value of the spltPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltPmtInd() {
        return spltPmtInd;
    }

    /**
     * Sets the value of the spltPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SaleContext8 setSpltPmtInd(Boolean value) {
        this.spltPmtInd = value;
        return this;
    }

    /**
     * Gets the value of the rctReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctReqInd() {
        return rctReqInd;
    }

    /**
     * Sets the value of the rctReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SaleContext8 setRctReqInd(Boolean value) {
        this.rctReqInd = value;
        return this;
    }

    /**
     * Gets the value of the rctTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rctTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRctTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptType1Code }
     * 
     * 
     * @return
     *     The value of the rctTp property.
     */
    public List<ReceiptType1Code> getRctTp() {
        if (rctTp == null) {
            rctTp = new ArrayList<>();
        }
        return this.rctTp;
    }

    /**
     * Gets the value of the rctDstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRctDstn() {
        return rctDstn;
    }

    /**
     * Sets the value of the rctDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext8 setRctDstn(String value) {
        this.rctDstn = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
     * Adds a new item to the rctTp list.
     * @see #getRctTp()
     * 
     */
    public SaleContext8 addRctTp(ReceiptType1Code rctTp) {
        getRctTp().add(rctTp);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public SaleContext8 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
