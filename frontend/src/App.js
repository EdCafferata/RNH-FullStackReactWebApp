import './App.css';
import React from 'react';
// eslint-disable-next-line import/no-extraneous-dependencies
import {
    Map, Marker, Popup, TileLayer,
// eslint-disable-next-line import/no-extraneous-dependencies
} from 'react-leaflet';
// eslint-disable-next-line import/no-extraneous-dependencies
import * as aisData from './marinetraphic.json';

// export const icon = new Icon({
// iconUrl: '/zeilboot.svg',
// iconSize: [25, 25],
// });

function App() {
    const [activeRegatta, setActiveRegatta] = React.useState(null);

    return (
        <Map center={[52.458510, 4.561492]} zoom={9}>
            <TileLayer
                url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
            />
            <TileLayer
                url="https://tiles.openseamap.org/seamark/{z}/{x}/{y}.png"
                attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
            />

            {aisData.features.map((gps) => (
                <Marker
                    key={gps.properties.MMSI}
                    position={[
                        gps.geometry.coordinates[1],
                        gps.geometry.coordinates[0],
                    ]}
                    onClick={() => {
                        setActiveRegatta(gps);
                    }}
                    // icon={icon} Nieuwe SVG image nog niet klaar.. ben leuk zeilbootje aan het maken.
                />
            ))}

            {activeRegatta && (
                <Popup
                    position={[
                        activeRegatta.geometry.coordinates[1],
                        activeRegatta.geometry.coordinates[0],
                    ]}
                    onClose={() => {
                        setActiveRegatta(null);
                    }}
                >
                    <div>
                        <h2>{activeRegatta.properties.MMSI}</h2>
                        <p>
                            <div>Couse (GPS) : </div>
                            {' '}
                            {activeRegatta.properties.COURSE}
                            <div>Speed (SOG) : </div>
                            {' '}
                            {activeRegatta.properties.SPEED}
                        </p>
                    </div>
                </Popup>
            )}
        </Map>
    );
}

export default App;
