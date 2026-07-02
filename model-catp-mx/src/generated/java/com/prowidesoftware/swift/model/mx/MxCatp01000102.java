
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for catp.010.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmpinMgmtReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.010.001.02")
public class MxCatp01000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMPINMgmtReq", required = true)
    protected ATMPINManagementRequestV02 atmpinMgmtReq;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMConfigurationParameter1 .class, ATMContext16 .class, ATMCustomer4 .class, ATMCustomerProfile1Code.class, ATMCustomerProfile4 .class, ATMEnvironment11 .class, ATMEquipment1 .class, ATMMediaType1Code.class, ATMMediaType2Code.class, ATMMessageFunction2 .class, ATMPINManagementRequest2 .class, ATMPINManagementRequestV02 .class, ATMService20 .class, ATMServiceType5Code.class, ATMTransaction9 .class, Acquirer7 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod7Code.class, AutomatedTellerMachine9 .class, BytePadding1Code.class, CardDataReading1Code.class, CardDataReading4Code.class, CardFallback1Code.class, CardholderAuthentication8 .class, CardholderVerificationCapability3Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, DataSetCategory7Code.class, DisplayCapabilities5 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header31 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MxCatp01000102 .class, OnLinePIN5 .class, OutputFormat1Code.class, PINFormat4Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, PaymentCard22 .class, PlainCardData18 .class, PointOfInteractionCapabilities7 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment2Code.class, TransactionEnvironment3Code.class, TransactionIdentifier1 .class, TransactionVerificationResult5 .class, UTMCoordinates1 .class, UserInterface5Code.class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.010.001.02";

    public MxCatp01000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp01000102(final String xml) {
        this();
        MxCatp01000102 tmp = parse(xml);
        atmpinMgmtReq = tmp.getATMPINMgmtReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp01000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmpinMgmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMPINManagementRequestV02 }
     *     
     */
    public ATMPINManagementRequestV02 getATMPINMgmtReq() {
        return atmpinMgmtReq;
    }

    /**
     * Sets the value of the atmpinMgmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMPINManagementRequestV02 }
     *     
     */
    public MxCatp01000102 setATMPINMgmtReq(ATMPINManagementRequestV02 value) {
        this.atmpinMgmtReq = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCatp01000102 parse(String xml) {
        return ((MxCatp01000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp01000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatp01000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatp01000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatp01000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp01000102 parse(String xml, MxRead parserImpl) {
        return ((MxCatp01000102) parserImpl.read(MxCatp01000102 .class, xml, _classes));
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
     * Creates an MxCatp01000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp01000102 message
     * @return
     *     a new instance of MxCatp01000102
     */
    public final static MxCatp01000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatp01000102 .class);
    }

}
