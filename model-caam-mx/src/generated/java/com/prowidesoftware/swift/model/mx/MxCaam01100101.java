
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for caam.011.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmXcptnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.011.001.01")
public class MxCaam01100101
    extends AbstractMX
{

    @XmlElement(name = "ATMXcptnAdvc", required = true)
    protected ATMExceptionAdviceV01 atmXcptnAdvc;
    public final static transient String BUSINESS_PROCESS = "caam";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMConfigurationParameter1 .class, ATMContext20 .class, ATMCustomer6 .class, ATMCustomerProfile1Code.class, ATMCustomerProfile4 .class, ATMEnvironment16 .class, ATMEquipment1 .class, ATMExceptionAdvice1 .class, ATMExceptionAdviceV01 .class, ATMMediaType1Code.class, ATMMediaType2Code.class, ATMMessageFunction2 .class, ATMService24 .class, ATMServiceType10Code.class, ATMTransaction27 .class, Acquirer7 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod7Code.class, AutomatedTellerMachine9 .class, BytePadding1Code.class, CardDataReading1Code.class, CardDataReading4Code.class, CardFallback1Code.class, CardholderVerificationCapability3Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, DataSetCategory7Code.class, DisplayCapabilities5 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, FailureReason8Code.class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header32 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MxCaam01100101 .class, OutputFormat1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, PaymentCard23 .class, PlainCardData19 .class, PointOfInteractionCapabilities7 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment2Code.class, TransactionEnvironment3Code.class, TransactionIdentifier1 .class, TransactionVerificationResult5 .class, UTMCoordinates1 .class, UserInterface5Code.class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caam.011.001.01";

    public MxCaam01100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaam01100101(final String xml) {
        this();
        MxCaam01100101 tmp = parse(xml);
        atmXcptnAdvc = tmp.getATMXcptnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaam01100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmXcptnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMExceptionAdviceV01 }
     *     
     */
    public ATMExceptionAdviceV01 getATMXcptnAdvc() {
        return atmXcptnAdvc;
    }

    /**
     * Sets the value of the atmXcptnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMExceptionAdviceV01 }
     *     
     */
    public MxCaam01100101 setATMXcptnAdvc(ATMExceptionAdviceV01 value) {
        this.atmXcptnAdvc = value;
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
    public static MxCaam01100101 parse(String xml) {
        return ((MxCaam01100101) MxReadImpl.parse(MxCaam01100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaam01100101 parse(String xml, MxRead parserImpl) {
        return ((MxCaam01100101) parserImpl.read(MxCaam01100101 .class, xml, _classes));
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
     * Creates an MxCaam01100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaam01100101 message
     * @return
     *     a new instance of MxCaam01100101
     */
    public final static MxCaam01100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaam01100101 .class);
    }

}
