
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
 * Class for catm.005.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mntncDlgtnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.005.001.05")
public class MxCatm00500105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MntncDlgtnReq", required = true)
    protected MaintenanceDelegationRequestV05 mntncDlgtnReq;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorConfigurationContent8 .class, AcquirerHostConfiguration6 .class, AcquirerProtocolParameters12 .class, AcquirerProtocolParameters8 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, ApplicationParameters8 .class, AttributeType1Code.class, AuthenticatedData5 .class, BatchTransactionType1Code.class, BytePadding1Code.class, CancellationProcess1Code.class, CertificateIssuer1 .class, ClockSynchronisation2 .class, ContentInformationType17 .class, ContentInformationType18 .class, ContentInformationType19 .class, ContentType2Code.class, CryptographicKey13 .class, CryptographicKeyType3Code.class, DataSetCategory10Code.class, DataSetCategory12Code.class, DataSetCategory13Code.class, DataSetIdentification7 .class, DigestedData5 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, ErrorAction4 .class, ExchangeConfiguration6 .class, ExchangeConfiguration7 .class, ExchangePolicy1Code.class, FinancialCapture1Code.class, GenericIdentification53 .class, GenericIdentification71 .class, GenericIdentification72 .class, GenericIdentification93 .class, GenericInformation1 .class, Header29 .class, HostCommunicationParameter5 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KEKIdentifier5 .class, KeyTransport5 .class, KeyUsage1Code.class, LocalDateTime1 .class, MaintenanceDelegateAction4 .class, MaintenanceDelegation8 .class, MaintenanceDelegationRequest5 .class, MaintenanceDelegationRequestV05 .class, MaintenanceIdentificationAssociation1 .class, MerchantConfigurationParameters4 .class, MessageFunction15Code.class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MxCatm00500105 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkParameters6 .class, NetworkType1Code.class, NetworkType2Code.class, Organisation26 .class, OriginatorInformation1 .class, POICommunicationType2Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType15Code.class, PartyType3Code.class, PartyType4Code.class, PartyType5Code.class, PartyType6Code.class, PaymentTerminalParameters6 .class, PhysicalInterfaceParameter1 .class, ProcessRetry2 .class, ProcessTiming3 .class, ProcessTiming4 .class, Recipient5Choice.class, Recipient6Choice.class, RelativeDistinguishedName1 .class, SaleToPOIProtocolParameter1 .class, SecurityParameters11 .class, SignedData5 .class, Signer4 .class, TMSAction7 .class, TMSProtocolParameters4 .class, TerminalManagementAction3Code.class, TerminalManagementAction4Code.class, TerminalManagementActionResult4Code.class, TerminalManagementActionTrigger1Code.class, TerminalManagementAdditionalProcess1Code.class, TerminalManagementDataSet27 .class, TerminalManagementErrorAction2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.005.001.05";

    public MxCatm00500105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00500105(final String xml) {
        this();
        MxCatm00500105 tmp = parse(xml);
        mntncDlgtnReq = tmp.getMntncDlgtnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00500105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mntncDlgtnReq property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceDelegationRequestV05 }
     *     
     */
    public MaintenanceDelegationRequestV05 getMntncDlgtnReq() {
        return mntncDlgtnReq;
    }

    /**
     * Sets the value of the mntncDlgtnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegationRequestV05 }
     *     
     */
    public MxCatm00500105 setMntncDlgtnReq(MaintenanceDelegationRequestV05 value) {
        this.mntncDlgtnReq = value;
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
    public static MxCatm00500105 parse(String xml) {
        return ((MxCatm00500105) MxReadImpl.parse(MxCatm00500105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00500105 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00500105) parserImpl.read(MxCatm00500105 .class, xml, _classes));
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
     * Creates an MxCatm00500105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00500105 message
     * @return
     *     a new instance of MxCatm00500105
     */
    public final static MxCatm00500105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00500105 .class);
    }

}
