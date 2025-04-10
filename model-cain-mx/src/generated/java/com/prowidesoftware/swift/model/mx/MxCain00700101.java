
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
 * Class for cain.007.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rcncltnInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.007.001.01")
public class MxCain00700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RcncltnInitn", required = true)
    protected ReconciliationInitiation rcncltnInitn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcquirerReconciliationInitiation1 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification15 .class, AmountAndDirection41 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardServiceType1Code.class, CardTransaction9 .class, CardTransactionEnvironment5 .class, CertificateIssuer1 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, EncapsulatedContent3 .class, EncryptionFormat1Code.class, GenericIdentification73 .class, GenericIdentification74 .class, Header17 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction6Code.class, MxCain00700101 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType10Code.class, PartyType9Code.class, Recipient4Choice.class, Recipient5Choice.class, ReconciliationInitiation.class, RelativeDistinguishedName1 .class, Response3Code.class, ResponseType2 .class, ResultDetail1Code.class, Traceability3 .class, TransactionIdentifier2 .class, TransactionTotals4 .class, TransactionTotals5 .class, TransactionTotals6 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.007.001.01";

    public MxCain00700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00700101(final String xml) {
        this();
        MxCain00700101 tmp = parse(xml);
        rcncltnInitn = tmp.getRcncltnInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rcncltnInitn property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationInitiation }
     *     
     */
    public ReconciliationInitiation getRcncltnInitn() {
        return rcncltnInitn;
    }

    /**
     * Sets the value of the rcncltnInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationInitiation }
     *     
     */
    public MxCain00700101 setRcncltnInitn(ReconciliationInitiation value) {
        this.rcncltnInitn = value;
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
    public static MxCain00700101 parse(String xml) {
        return ((MxCain00700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00700101 parse(String xml, MxRead parserImpl) {
        return ((MxCain00700101) parserImpl.read(MxCain00700101 .class, xml, _classes));
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
     * Creates an MxCain00700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00700101 message
     * @return
     *     a new instance of MxCain00700101
     */
    public static final MxCain00700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00700101 .class);
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
