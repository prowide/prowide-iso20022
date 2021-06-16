
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.007.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "modfyTx"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.007.001.08")
public class MxCamt00700108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ModfyTx", required = true)
    protected ModifyTransactionV08 modfyTx;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, Instruction1Code.class, LongPaymentIdentification2 .class, MessageHeader1 .class, ModifyTransactionV08 .class, MxCamt00700108 .class, PaymentIdentification6Choice.class, PaymentInstruction33 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentType3Code.class, PaymentType4Choice.class, PostalAddress24 .class, Priority1Choice.class, Priority5Code.class, QueueTransactionIdentification1 .class, ShortPaymentIdentification2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionModification5 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.007.001.08";

    public MxCamt00700108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00700108(final String xml) {
        this();
        MxCamt00700108 tmp = parse(xml);
        modfyTx = tmp.getModfyTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00700108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the modfyTx property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyTransactionV08 }
     *     
     */
    public ModifyTransactionV08 getModfyTx() {
        return modfyTx;
    }

    /**
     * Sets the value of the modfyTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyTransactionV08 }
     *     
     */
    public MxCamt00700108 setModfyTx(ModifyTransactionV08 value) {
        this.modfyTx = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCamt00700108 parse(String xml) {
        return ((MxCamt00700108) MxReadImpl.parse(MxCamt00700108 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00700108 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00700108) parserImpl.read(MxCamt00700108 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxCamt00700108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00700108 message
     * @return
     *     a new instance of MxCamt00700108
     */
    public final static MxCamt00700108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00700108 .class);
    }

}
