
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
 * Class for caam.001.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmDvcRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.001.001.04")
public class MxCaam00100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMDvcRpt", required = true)
    protected ATMDeviceReportV04 atmDvcRpt;
    public static final transient String BUSINESS_PROCESS = "caam";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATMCommand15 .class, ATMCommand16 .class, ATMCommand7Code.class, ATMCommandIdentification1 .class, ATMConfigurationParameter1 .class, ATMDevice2Code.class, ATMDeviceReport4 .class, ATMDeviceReportV04 .class, ATMEnvironment6 .class, ATMEquipment1 .class, ATMEquipment2 .class, ATMMessageFunction2 .class, ATMSecurityConfiguration1 .class, ATMSecurityConfiguration2 .class, ATMSecurityConfiguration3 .class, ATMSecurityConfiguration4 .class, ATMSecurityConfiguration5 .class, ATMSecurityContext5 .class, ATMSecurityDevice2 .class, ATMSecurityScheme3Code.class, ATMSecurityScheme4Code.class, ATMStatus1Code.class, ATMStatus2 .class, ATMStatus2Code.class, ATMStatus3Code.class, Acquirer7 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AttributeType1Code.class, AuthenticatedData4 .class, AutomatedTellerMachine5 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType13 .class, ContentType2Code.class, CryptographicKey11 .class, CryptographicKeyType3Code.class, DataSetCategory7Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, FailureReason5Code.class, FailureReason6Code.class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header31 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, KeyUsage1Code.class, MessageFunction11Code.class, MessageProtection1Code.class, MxCaam00100104 .class, PINFormat4Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, PartyType12Code.class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, SignedData4 .class, Signer3 .class, TR34Status1Code.class, TerminalHosting1 .class, TerminalManagementActionResult2Code.class, Traceability4 .class, TransactionEnvironment2Code.class, TransactionEnvironment3Code.class, UTMCoordinates1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caam.001.001.04";

    public MxCaam00100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaam00100104(final String xml) {
        this();
        MxCaam00100104 tmp = parse(xml);
        atmDvcRpt = tmp.getATMDvcRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaam00100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmDvcRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDeviceReportV04 }
     *     
     */
    public ATMDeviceReportV04 getATMDvcRpt() {
        return atmDvcRpt;
    }

    /**
     * Sets the value of the atmDvcRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDeviceReportV04 }
     *     
     */
    public MxCaam00100104 setATMDvcRpt(ATMDeviceReportV04 value) {
        this.atmDvcRpt = value;
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
    public static MxCaam00100104 parse(String xml) {
        return ((MxCaam00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaam00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaam00100104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaam00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaam00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaam00100104 parse(String xml, MxRead parserImpl) {
        return ((MxCaam00100104) parserImpl.read(MxCaam00100104 .class, xml, _classes));
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
     * Creates an MxCaam00100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaam00100104 message
     * @return
     *     a new instance of MxCaam00100104
     */
    public static final MxCaam00100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaam00100104 .class);
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
