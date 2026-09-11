
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for cafm.001.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fileActnInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafm.001.001.04")
public class MxCafm00100104
    extends AbstractMX
{

    @XmlElement(name = "FileActnInitn", required = true)
    protected FileActionInitiationV04 fileActnInitn;
    public static final transient String BUSINESS_PROCESS = "cafm";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData3 .class, AcquirerData1 .class, AdditionalData1 .class, AdditionalFee4 .class, Address4 .class, Authority1 .class, CardData17 .class, CardDataReading11Code.class, CardDataReading12Code.class, CardDataWriting2Code.class, Cardholder23 .class, CardholderName2 .class, CardholderVerificationCapability6Code.class, ContactPersonal2 .class, ContentInformationType41 .class, CorporateTaxType1Code.class, CorrectionIdentification1 .class, Credentials3 .class, CreditDebit3Code.class, CustomerDevice6 .class, DestinationData1 .class, DeviceIdentification2 .class, DeviceIdentificationType2Code.class, DisplayCapabilities6 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, FileActionInitiationV04 .class, FileActionScope1Code.class, FileActionType3Code.class, FinancialInstitution10 .class, Frequency12Code.class, Header72 .class, IssuerData1 .class, Jurisdiction2 .class, LocalAddress1 .class, LocalAddress2 .class, LocalData10 .class, LocalData19 .class, LocalData20 .class, LocalData21 .class, LocalData24 .class, MACData1 .class, MxCafm00100104 .class, OnLineCapability2Code.class, OriginatorData2 .class, OutputFormat1Code.class, OutputFormat7Code.class, POIComponentType5Code.class, PayeeData1 .class, PayerData1 .class, PointOfInteractionComponent16 .class, ProgrammeMode6 .class, ProtectionMethod2Code.class, ReceiverData1 .class, Reconciliation5 .class, RiskAssessment1Code.class, SenderData1 .class, SettlementService7 .class, Software2 .class, SoftwareType2Code.class, StorageLocation2Code.class, Terminal10 .class, TerminalIntegrationCategory1Code.class, TerminalType2Code.class, Token4 .class, Token5 .class, UserInterface1Code.class, Wallet4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafm.001.001.04";

    public MxCafm00100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafm00100104(final String xml) {
        this();
        MxCafm00100104 tmp = parse(xml);
        fileActnInitn = tmp.getFileActnInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafm00100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fileActnInitn property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionInitiationV04 }
     *     
     */
    public FileActionInitiationV04 getFileActnInitn() {
        return fileActnInitn;
    }

    /**
     * Sets the value of the fileActnInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionInitiationV04 }
     *     
     */
    public MxCafm00100104 setFileActnInitn(FileActionInitiationV04 value) {
        this.fileActnInitn = value;
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
    public static MxCafm00100104 parse(String xml) {
        return ((MxCafm00100104) MxReadImpl.parse(MxCafm00100104 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafm00100104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafm00100104) MxReadImpl.parse(MxCafm00100104 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafm00100104 parse(String xml, MxRead parserImpl) {
        return ((MxCafm00100104) parserImpl.read(MxCafm00100104 .class, xml, _classes));
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
     * Creates an MxCafm00100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafm00100104 message
     * @return
     *     a new instance of MxCafm00100104
     */
    public static final MxCafm00100104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCafm00100104 .class);
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
