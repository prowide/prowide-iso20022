
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.007.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "modfyTx"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.007.001.10")
public class MxCamt00700110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ModfyTx", required = true)
    protected ModifyTransactionV10 modfyTx;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, Instruction1Code.class, LongPaymentIdentification4 .class, MessageHeader1 .class, ModifyTransactionV10 .class, MxCamt00700110 .class, PaymentIdentification8Choice.class, PaymentInstruction33 .class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PaymentType3Code.class, PaymentType4Choice.class, PostalAddress27 .class, Priority1Choice.class, Priority5Code.class, QueueTransactionIdentification1 .class, ShortPaymentIdentification4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionModification7 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.007.001.10";

    public MxCamt00700110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00700110(final String xml) {
        this();
        MxCamt00700110 tmp = parse(xml);
        modfyTx = tmp.getModfyTx();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00700110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the modfyTx property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyTransactionV10 }
     *     
     */
    public ModifyTransactionV10 getModfyTx() {
        return modfyTx;
    }

    /**
     * Sets the value of the modfyTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyTransactionV10 }
     *     
     */
    public MxCamt00700110 setModfyTx(ModifyTransactionV10 value) {
        this.modfyTx = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt00700110 parse(String xml) {
        return ((MxCamt00700110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00700110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00700110 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00700110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00700110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00700110 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00700110) parserImpl.read(MxCamt00700110 .class, xml, _classes));
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
     * Creates an MxCamt00700110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00700110 message
     * @return
     *     a new instance of MxCamt00700110
     */
    public static final MxCamt00700110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00700110 .class);
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

}
