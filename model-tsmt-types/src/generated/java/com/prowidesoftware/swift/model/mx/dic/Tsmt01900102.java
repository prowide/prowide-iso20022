
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
 * Scope
 * The InitialBaselineSubmission message is sent by the initiator of a transaction to the matching application.
 * This message is used to initiate a transaction.
 * Usage
 * The InitialBaselineSubmission message can be sent by a party to register a transaction in the matching application. The message can be submitted with either lodge or push-through instruction.
 * When the push-through instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message, stores the submitted information and informs the counterparty about the registration of the transaction by sending a FullPushThroughReport message. With the BaselineReSubmission message the counterparty responds with matching baseline information in order to establish the transaction (baseline).
 * When the lodge instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message and stores the submitted information. No matching of the submitted baseline data with other baseline information will take place. For example the submission of an InitialBaselineSubmission message containing a lodge instruction establishes the transaction (baseline) in the matching application.
 * The InitialBaselineSubmission message consists of data which relates to the purchasing agreement covered by the transaction, for example line item details, shipping details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.019.001.02", propOrder = {
    "submissnId",
    "submitrTxRef",
    "instr",
    "baseln",
    "buyrCtctPrsn",
    "sellrCtctPrsn",
    "buyrBkCtctPrsn",
    "sellrBkCtctPrsn",
    "bllToCtctPrsn",
    "shipToCtctPrsn",
    "consgnCtctPrsn"
})
public class Tsmt01900102 {

    @XmlElement(name = "SubmissnId", required = true)
    protected MessageIdentification1 submissnId;
    @XmlElement(name = "SubmitrTxRef", required = true)
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "Instr", required = true)
    protected InstructionType1 instr;
    @XmlElement(name = "Baseln", required = true)
    protected Baseline2 baseln;
    @XmlElement(name = "BuyrCtctPrsn")
    protected List<ContactIdentification1> buyrCtctPrsn;
    @XmlElement(name = "SellrCtctPrsn")
    protected List<ContactIdentification1> sellrCtctPrsn;
    @XmlElement(name = "BuyrBkCtctPrsn")
    protected List<ContactIdentification1> buyrBkCtctPrsn;
    @XmlElement(name = "SellrBkCtctPrsn")
    protected List<ContactIdentification1> sellrBkCtctPrsn;
    @XmlElement(name = "BllToCtctPrsn")
    protected List<ContactIdentification1> bllToCtctPrsn;
    @XmlElement(name = "ShipToCtctPrsn")
    protected List<ContactIdentification1> shipToCtctPrsn;
    @XmlElement(name = "ConsgnCtctPrsn")
    protected List<ContactIdentification1> consgnCtctPrsn;

    /**
     * Gets the value of the submissnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getSubmissnId() {
        return submissnId;
    }

    /**
     * Sets the value of the submissnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt01900102 setSubmissnId(MessageIdentification1 value) {
        this.submissnId = value;
        return this;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public Tsmt01900102 setSubmitrTxRef(SimpleIdentificationInformation value) {
        this.submitrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the instr property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionType1 }
     *     
     */
    public InstructionType1 getInstr() {
        return instr;
    }

    /**
     * Sets the value of the instr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionType1 }
     *     
     */
    public Tsmt01900102 setInstr(InstructionType1 value) {
        this.instr = value;
        return this;
    }

    /**
     * Gets the value of the baseln property.
     * 
     * @return
     *     possible object is
     *     {@link Baseline2 }
     *     
     */
    public Baseline2 getBaseln() {
        return baseln;
    }

    /**
     * Sets the value of the baseln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Baseline2 }
     *     
     */
    public Tsmt01900102 setBaseln(Baseline2 value) {
        this.baseln = value;
        return this;
    }

    /**
     * Gets the value of the buyrCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyrCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     */
    public List<ContactIdentification1> getBuyrCtctPrsn() {
        if (buyrCtctPrsn == null) {
            buyrCtctPrsn = new ArrayList<ContactIdentification1>();
        }
        return this.buyrCtctPrsn;
    }

    /**
     * Gets the value of the sellrCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellrCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     */
    public List<ContactIdentification1> getSellrCtctPrsn() {
        if (sellrCtctPrsn == null) {
            sellrCtctPrsn = new ArrayList<ContactIdentification1>();
        }
        return this.sellrCtctPrsn;
    }

    /**
     * Gets the value of the buyrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     */
    public List<ContactIdentification1> getBuyrBkCtctPrsn() {
        if (buyrBkCtctPrsn == null) {
            buyrBkCtctPrsn = new ArrayList<ContactIdentification1>();
        }
        return this.buyrBkCtctPrsn;
    }

    /**
     * Gets the value of the sellrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     */
    public List<ContactIdentification1> getSellrBkCtctPrsn() {
        if (sellrBkCtctPrsn == null) {
            sellrBkCtctPrsn = new ArrayList<ContactIdentification1>();
        }
        return this.sellrBkCtctPrsn;
    }

    /**
     * Gets the value of the bllToCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bllToCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBllToCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     */
    public List<ContactIdentification1> getBllToCtctPrsn() {
        if (bllToCtctPrsn == null) {
            bllToCtctPrsn = new ArrayList<ContactIdentification1>();
        }
        return this.bllToCtctPrsn;
    }

    /**
     * Gets the value of the shipToCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     */
    public List<ContactIdentification1> getShipToCtctPrsn() {
        if (shipToCtctPrsn == null) {
            shipToCtctPrsn = new ArrayList<ContactIdentification1>();
        }
        return this.shipToCtctPrsn;
    }

    /**
     * Gets the value of the consgnCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consgnCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsgnCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     */
    public List<ContactIdentification1> getConsgnCtctPrsn() {
        if (consgnCtctPrsn == null) {
            consgnCtctPrsn = new ArrayList<ContactIdentification1>();
        }
        return this.consgnCtctPrsn;
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
     * Adds a new item to the buyrCtctPrsn list.
     * @see #getBuyrCtctPrsn()
     * 
     */
    public Tsmt01900102 addBuyrCtctPrsn(ContactIdentification1 buyrCtctPrsn) {
        getBuyrCtctPrsn().add(buyrCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the sellrCtctPrsn list.
     * @see #getSellrCtctPrsn()
     * 
     */
    public Tsmt01900102 addSellrCtctPrsn(ContactIdentification1 sellrCtctPrsn) {
        getSellrCtctPrsn().add(sellrCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the buyrBkCtctPrsn list.
     * @see #getBuyrBkCtctPrsn()
     * 
     */
    public Tsmt01900102 addBuyrBkCtctPrsn(ContactIdentification1 buyrBkCtctPrsn) {
        getBuyrBkCtctPrsn().add(buyrBkCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the sellrBkCtctPrsn list.
     * @see #getSellrBkCtctPrsn()
     * 
     */
    public Tsmt01900102 addSellrBkCtctPrsn(ContactIdentification1 sellrBkCtctPrsn) {
        getSellrBkCtctPrsn().add(sellrBkCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the bllToCtctPrsn list.
     * @see #getBllToCtctPrsn()
     * 
     */
    public Tsmt01900102 addBllToCtctPrsn(ContactIdentification1 bllToCtctPrsn) {
        getBllToCtctPrsn().add(bllToCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the shipToCtctPrsn list.
     * @see #getShipToCtctPrsn()
     * 
     */
    public Tsmt01900102 addShipToCtctPrsn(ContactIdentification1 shipToCtctPrsn) {
        getShipToCtctPrsn().add(shipToCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the consgnCtctPrsn list.
     * @see #getConsgnCtctPrsn()
     * 
     */
    public Tsmt01900102 addConsgnCtctPrsn(ContactIdentification1 consgnCtctPrsn) {
        getConsgnCtctPrsn().add(consgnCtctPrsn);
        return this;
    }

}
